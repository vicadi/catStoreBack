package com.catstore.servicestore.services.impl;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.catstore.servicestore.dtos.payment.CreditCardData;
import com.catstore.servicestore.dtos.payment.RequestDoPurchase;
import com.catstore.servicestore.dtos.payment.RequestDoReversion;
import com.catstore.servicestore.dtos.payment.ResponsePaymentProvider;
import com.catstore.servicestore.dtos.payment.ResponseTokenProvider;
import com.catstore.servicestore.dtos.payu.RequestPayment;
import com.catstore.servicestore.dtos.payu.RequestRefund;
import com.catstore.servicestore.dtos.payu.RequestToken;
import com.catstore.servicestore.dtos.payu.ResponseToken;
import com.catstore.servicestore.dtos.payu.ResponseTransaction;
import com.catstore.servicestore.mappers.MapperPayuProvider;
import com.catstore.servicestore.services.PaymentProvider;

@Service
public class PayuPaymentProvider implements PaymentProvider {
	
	
	private RestTemplate restTemplate;
	
	private MapperPayuProvider mapperPayuProvider;
	
	@Value("${endpoint.sandbox}")
	private String URL;
	
	@PostConstruct
	private void postConstruct() {
		restTemplate = new RestTemplate();
		mapperPayuProvider = new MapperPayuProvider();
	}

	@Override
	public ResponsePaymentProvider doPay(RequestDoPurchase requestPay) {
		ResponseTransaction response = doTransactionPayu(mapperPayuProvider
				.mapperReqDoPurchaseToRequestPayment(requestPay));
		return mapperPayuProvider.mapperPaymentToPaymentProvider(response);
	}

	@Override
	public ResponsePaymentProvider revertpay(RequestDoReversion requestReversion) {
		ResponseTransaction response = doTransactionPayu(mapperPayuProvider
				.mapperReqDoReversionToReqRefund(requestReversion));
		return mapperPayuProvider.mapperPaymentToPaymentProvider(response);
	}

	@Override
	public ResponseTokenProvider generateToken(CreditCardData creditCardData) {
		ResponseToken responseToken = generateTokenPayu(mapperPayuProvider
				.mapperCreditCardDataToRequestToken(creditCardData));
		return mapperPayuProvider.mapperTokenToTokeProvider(responseToken);
	}
	
	private ResponseTransaction doTransactionPayu(RequestPayment requestPay) {
		return restTemplate.postForObject(URL, requestPay, ResponseTransaction.class);
	}
	
	private ResponseTransaction doTransactionPayu(RequestRefund requestPay) {
		return restTemplate.postForObject(URL, requestPay, ResponseTransaction.class);
	}
	
	private ResponseToken generateTokenPayu(RequestToken requestToken) {
		return restTemplate.postForObject(URL, requestToken, ResponseToken.class);
	}

}
