package com.catstore.servicestore.services.impl;

import org.springframework.stereotype.Service;

import com.catstore.servicestore.dtos.request.RequestRefundDto;
import com.catstore.servicestore.dtos.request.RequestTokenDto;
import com.catstore.servicestore.dtos.request.RequestTxDto;
import com.catstore.servicestore.dtos.response.ResponseTokenDto;
import com.catstore.servicestore.dtos.response.ResponseTxDto;
import com.catstore.servicestore.services.PaymentProvider;

@Service
public class PayuPaymentProvider implements PaymentProvider {

	@Override
	public ResponseTxDto doPay(RequestTxDto requestPay) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseTxDto revertpay(RequestRefundDto requestRefund) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseTokenDto generateToken(RequestTokenDto requestToken) {
		// TODO Auto-generated method stub
		return null;
	}

}
