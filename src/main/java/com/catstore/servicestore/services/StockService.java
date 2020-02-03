package com.catstore.servicestore.services;

import com.catstore.servicestore.dtos.payment.RequestDoPurchase;
import com.catstore.servicestore.dtos.payment.RequestDoReversion;
import com.catstore.servicestore.dtos.payment.ResponsePayment;
import com.catstore.servicestore.dtos.payment.ResponsePaymentProvider;
import com.catstore.servicestore.dtos.payment.ResponseTokenProvider;

public interface StockService {
	
	ResponsePayment updateStockByPay(RequestDoPurchase requestDoParchase,
			ResponsePaymentProvider responsePaymentProvider);
	
	ResponsePayment updateStockByRevert(RequestDoReversion requestDoReversion,
			ResponsePaymentProvider responsePaymentProvider);
	
	Boolean saveToken(ResponseTokenProvider responseTokenProvider,
			RequestDoPurchase requestDoParchase);

}
