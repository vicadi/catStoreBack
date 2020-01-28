package com.catstore.servicestore.mappers;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import com.catstore.servicestore.constants.PayuConstants;
import com.catstore.servicestore.dtos.payment.CreditCardData;
import com.catstore.servicestore.dtos.payment.Customer;
import com.catstore.servicestore.dtos.payment.ProductDetail;
import com.catstore.servicestore.dtos.payment.RequestDoPurchase;
import com.catstore.servicestore.dtos.payment.RequestDoReversion;
import com.catstore.servicestore.dtos.payment.ResponsePaymentProvider;
import com.catstore.servicestore.dtos.payment.ResponseTokenProvider;
import com.catstore.servicestore.dtos.payu.AdditionalValuesDto;
import com.catstore.servicestore.dtos.payu.CreditCardPayment;
import com.catstore.servicestore.dtos.payu.CreditCardToken;
import com.catstore.servicestore.dtos.payu.Merchant;
import com.catstore.servicestore.dtos.payu.OrderPayment;
import com.catstore.servicestore.dtos.payu.OrderRefund;
import com.catstore.servicestore.dtos.payu.Payer;
import com.catstore.servicestore.dtos.payu.RequestPayment;
import com.catstore.servicestore.dtos.payu.RequestRefund;
import com.catstore.servicestore.dtos.payu.RequestToken;
import com.catstore.servicestore.dtos.payu.ResponseToken;
import com.catstore.servicestore.dtos.payu.ResponseTransaction;
import com.catstore.servicestore.dtos.payu.TransactionPayment;
import com.catstore.servicestore.dtos.payu.TransactionRefund;
import com.catstore.servicestore.dtos.payu.TxValue;
import com.catstore.servicestore.enums.TypeCommand;
import com.catstore.servicestore.enums.TypeTransaction;

public class MapperPayuProvider {
	
	public final RequestPayment mapperReqDoPurchaseToRequestPayment(RequestDoPurchase object) {
		return  (RequestPayment) new RequestPayment.Builder()
				.withTransaction(mapperReqDoPurchaseToTransactionPayment(object)).withTest(false)
				.withLanguage(PayuConstants.LANGUAGE)
				.withCommand(TypeCommand.SUBMIT_TRANSACTION.toString())
				.withMerchant(getMerchantGeneric()).build();
	}
	
	private Merchant getMerchantGeneric() {
		return new Merchant.Builder().withApiKey(PayuConstants.API_KEY)
				.withApiLogin(PayuConstants.API_LOGIN).build();
	}
	
	@SuppressWarnings("serial")
	private TransactionPayment mapperReqDoPurchaseToTransactionPayment(RequestDoPurchase purchase) {
		return new TransactionPayment.Builder().withOrder(mapperDataToOrderPayment
				(purchase.getReferenceCode(), purchase.getDescription(),purchase.getListProducts()))
				.withPayer(mapperCustomerToPayer(purchase.getCustomerData()))
				.withCreditCard(mapperCreditCardDataToCreditCardPayment(purchase.getCreditCard()))
				.withExtraParameters(new HashMap<String, String>() {{
					put("INSTALLMENTS_NUMBER", purchase.getCreditCard()
						.getInstallmentsNumber());}}
				)
				.withType(TypeTransaction.AUTHORIZATION_AND_CAPTURE.toString())
				.withPaymentMethod(purchase.getCreditCard().getTypeCard())
				.withPaymentCountry(purchase.getPaymentCountry()).build();
				
	}
	
	private OrderPayment mapperDataToOrderPayment(String referenceCode, String description,
			List<ProductDetail> listProducts) {
		return new OrderPayment.Builder().withAccountId(PayuConstants.ACCOUNT_ID)
				.withReferenceCode(referenceCode).withDescription(description)
				.withLanguage(PayuConstants.LANGUAGE)
				.withAdditionalValues(new AdditionalValuesDto.Builder()
						.withTxValue(new TxValue.Builder().withValue(getTotalValue(listProducts))
								.withCurrency(PayuConstants.CURRENCY).build()).build())
				.build();
	}
	
	private Integer getTotalValue(List<ProductDetail> listProducts) {
		return listProducts.stream().map(product -> product.getQuantify() * product.getAmount())
				.collect(Collectors.toList()).stream().mapToInt(Integer::intValue).sum();
	}
	
	private Payer mapperCustomerToPayer(Customer customer) {
		return new Payer.Builder().withMerchantPayerId(PayuConstants.MERCHANT_PAYER_ID)
				.withFullName(customer.getFullName()).withEmailAddress(customer.getEmailAddress())
				.withContactPhone(customer.getContactPhone()).withDniNumber(customer.getDniNumber())
				.build();
	}
	
	private CreditCardPayment mapperCreditCardDataToCreditCardPayment(CreditCardData creditCardData) {
		return new CreditCardPayment.Builder().withNumber(creditCardData.getNumber())
				.withSecurityCode(creditCardData.getSecurityCode())
				.withExpirationDate(creditCardData.getExpirationDate())
				.withName(creditCardData.getNameCard()).build();
	}
	
	public RequestToken mapperCreditCardDataToRequestToken(CreditCardData creditCardData) {
		return (RequestToken) new RequestToken.Builder().withCreditCardToken
				(mapperCreditCardDataToCreditCardToken(creditCardData))
				.withLanguage(PayuConstants.LANGUAGE).withCommand(TypeCommand
						.CREATE_TOKEN.toString()).withMerchant(getMerchantGeneric())
				.withTest(false).build();
	}
	
	private CreditCardToken mapperCreditCardDataToCreditCardToken(CreditCardData creditCardData) {
		return new CreditCardToken.Builder().withPayerId(PayuConstants.PAYER_ID)
				.withName(creditCardData.getNameCard()).withIdentificationNumber(creditCardData
						.getIdentificationCustomer()).withPaymentMethod(creditCardData.getTypeCard()
								.toString()).withNumber(creditCardData.getNumber())
				.withExpirationDate(creditCardData.getExpirationDate()).build();
	}
	
	public ResponseTokenProvider mapperTokenToTokeProvider(ResponseToken token) {
		return new ResponseTokenProvider.Builder().withCodeTransaction(token.getCode())
				.withMessageError(token.getError()).withCreditCardTokenId(token.getCreditCardToken()
						.getCreditCardTokenId()).build();
	}
	
	public ResponsePaymentProvider mapperPaymentToPaymentProvider(ResponseTransaction payment) {
		return new ResponsePaymentProvider.Builder().withCodeTransaction(payment.getCode())
				.withMessageError(payment.getError()).withState(payment.getTransactionResponse()
						.getState()).withOrderId(payment.getTransactionResponse().getOrderId())
				.withTransactionId(payment.getTransactionResponse().getTransactionId())
				.withTrazabilityCode(payment.getTransactionResponse().getTrazabilityCode())
				.withPendingReason(payment.getTransactionResponse().getPendingReason()).build();
	}
	
	public RequestRefund mapperReqDoReversionToReqRefund(RequestDoReversion reversion) {
		return (RequestRefund) new RequestRefund.Builder()
				.withTransaction(mapperReqDoReversionToTxRefund(reversion))
				.withLanguage(PayuConstants.LANGUAGE).withCommand(TypeCommand.SUBMIT_TRANSACTION
						.toString()).withMerchant(getMerchantGeneric()).build();
	}
	
	private TransactionRefund mapperReqDoReversionToTxRefund(RequestDoReversion reversion) {
		return new TransactionRefund.Builder().withOrder(new OrderRefund.Builder()
				.withId(reversion.getOrderId()).build()).withType(TypeTransaction.REFUND.toString())
				.withParentTransactionId(reversion.getTransactionId()).build();
	}
	
}
