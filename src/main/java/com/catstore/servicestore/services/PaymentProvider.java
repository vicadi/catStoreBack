package com.catstore.servicestore.services;

import com.catstore.servicestore.dtos.request.RequestRefundDto;
import com.catstore.servicestore.dtos.request.RequestTokenDto;
import com.catstore.servicestore.dtos.request.RequestTxDto;
import com.catstore.servicestore.dtos.response.ResponseTokenDto;
import com.catstore.servicestore.dtos.response.ResponseTxDto;

public interface PaymentProvider {
	
	ResponseTxDto doPay(RequestTxDto requestPay);
	
	ResponseTxDto revertpay(RequestRefundDto requestRefund);
	
	ResponseTokenDto generateToken(RequestTokenDto requestToken);

}
