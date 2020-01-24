package com.catstore.servicestore.services.impl;

import org.springframework.stereotype.Service;

import com.catstore.servicestore.dtos.request.CreditCardTokenDto;
import com.catstore.servicestore.dtos.request.RequestDoPurchaseDto;
import com.catstore.servicestore.dtos.response.ResponseTokenDto;
import com.catstore.servicestore.dtos.response.ResponseTxDto;
import com.catstore.servicestore.services.PaymentProvider;

@Service
public class PayuPaymentProvider implements PaymentProvider {

	@Override
	public ResponseTxDto doPay(RequestDoPurchaseDto requestPay) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseTxDto revertpay(Integer idPurchase) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseTokenDto generateToken(CreditCardTokenDto creditCardToken) {
		// TODO Auto-generated method stub
		return null;
	}

}
