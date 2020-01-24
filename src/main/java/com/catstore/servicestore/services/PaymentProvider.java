package com.catstore.servicestore.services;

import com.catstore.servicestore.dtos.request.CreditCardTokenDto;
import com.catstore.servicestore.dtos.request.RequestDoPurchaseDto;
import com.catstore.servicestore.dtos.response.ResponseTokenDto;
import com.catstore.servicestore.dtos.response.ResponseTxDto;

public interface PaymentProvider {
	
	ResponseTxDto doPay(RequestDoPurchaseDto requestPay);
	
	ResponseTxDto revertpay(Integer idPurchase);
	
	ResponseTokenDto generateToken(CreditCardTokenDto creditCardToken);

}
