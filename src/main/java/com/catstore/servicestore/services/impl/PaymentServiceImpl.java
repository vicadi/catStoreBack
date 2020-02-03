package com.catstore.servicestore.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.catstore.servicestore.UtilsTemp;
import com.catstore.servicestore.constants.GlobalConstants;
import com.catstore.servicestore.dtos.payment.RequestDoPurchase;
import com.catstore.servicestore.dtos.payment.RequestDoReversion;
import com.catstore.servicestore.dtos.payment.ResponsePayment;
import com.catstore.servicestore.dtos.payment.ResponsePaymentProvider;
import com.catstore.servicestore.dtos.payment.ResponseTokenProvider;
import com.catstore.servicestore.services.PaymentProvider;
import com.catstore.servicestore.services.PaymentService;
import com.catstore.servicestore.services.StockService;

@Service
public class PaymentServiceImpl implements PaymentService {
	
	@Autowired
	private PaymentProvider paymentProviderService;
	
	@Autowired
	private StockService stockService;
	
	ResponsePayment responsePayment;

	@Override
	public ResponseEntity<ResponsePayment> doPurchase(RequestDoPurchase requestDoParchase) {
		ResponsePaymentProvider responsePaymentProvider = paymentProviderService
				.doPay(requestDoParchase);
		UtilsTemp.printObject(responsePaymentProvider, "PAGO");
		return doTxGeneric(responsePaymentProvider, null, requestDoParchase, true);
	}

	@Override
	public ResponseEntity<ResponsePayment> doReversion(RequestDoReversion requestReversion) {
		ResponsePaymentProvider responsePaymentProvider = paymentProviderService
				.revertpay(requestReversion);
		UtilsTemp.printObject(responsePaymentProvider, "REVERSION");
		return doTxGeneric(responsePaymentProvider, requestReversion, null, true);
	}
	
	private ResponseEntity<ResponsePayment> doTxGeneric(ResponsePaymentProvider responsePaymentProvider,
			RequestDoReversion requestReversion, RequestDoPurchase requestDoParchase, Boolean isReversion) {
		responsePayment  = new ResponsePayment.Builder()
				.withStatus(responsePaymentProvider.getState())
				.withDescription(responsePaymentProvider.getMessageError()).build();
		if (responsePaymentProvider.getCodeTransaction().equals(GlobalConstants.SUCCESS)) {
			if (responsePaymentProvider.getState().equals(GlobalConstants.APPROVED)) {
				responsePayment = Boolean.TRUE.equals(isReversion) ? stockService
						.updateStockByRevert(requestReversion,responsePaymentProvider) 
						: createTokenToCard(requestDoParchase, responsePaymentProvider);;
				return new ResponseEntity<ResponsePayment>(responsePayment, HttpStatus.OK); 
				
			} else {
				return new ResponseEntity<ResponsePayment>(responsePayment, HttpStatus.CONFLICT);
			}
		} else {
			return new ResponseEntity<ResponsePayment>(responsePayment,
					HttpStatus.INTERNAL_SERVER_ERROR); 
		} 
	}
	
	private ResponsePayment createTokenToCard(RequestDoPurchase requestDoParchase,
			ResponsePaymentProvider responsePaymentProvider) {
		if (Boolean.FALSE.equals(requestDoParchase.getHasToken()) 
				&& Boolean.TRUE.equals(requestDoParchase.getTokenizedCreditCard())) {
			ResponseTokenProvider responseTokenProvider = paymentProviderService
					.generateToken(requestDoParchase.getCreditCard());
			UtilsTemp.printObject(responseTokenProvider, "TOKEN");
			stockService.saveToken(responseTokenProvider, requestDoParchase);
		}
		return stockService.updateStockByPay(requestDoParchase, responsePaymentProvider);
	}

}
