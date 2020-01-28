package com.catstore.servicestore.services;

import com.catstore.servicestore.dtos.payment.CreditCardData;
import com.catstore.servicestore.dtos.payment.RequestDoPurchase;
import com.catstore.servicestore.dtos.payment.RequestDoReversion;
import com.catstore.servicestore.dtos.payment.ResponsePaymentProvider;
import com.catstore.servicestore.dtos.payment.ResponseTokenProvider;

public interface PaymentProvider {
	
	ResponsePaymentProvider doPay(RequestDoPurchase requestPay);
	
	ResponsePaymentProvider revertpay(RequestDoReversion requestReversion);
	
	ResponseTokenProvider generateToken(CreditCardData creditCardData);

}
