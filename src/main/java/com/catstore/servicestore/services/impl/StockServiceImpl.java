package com.catstore.servicestore.services.impl;

import org.springframework.stereotype.Service;

import com.catstore.servicestore.dtos.payment.RequestDoPurchase;
import com.catstore.servicestore.dtos.payment.RequestDoReversion;
import com.catstore.servicestore.dtos.payment.ResponsePayment;
import com.catstore.servicestore.dtos.payment.ResponsePaymentProvider;
import com.catstore.servicestore.dtos.payment.ResponseTokenProvider;
import com.catstore.servicestore.services.StockService;

@Service
public class StockServiceImpl implements StockService {

	@Override
	public ResponsePayment updateStockByPay(RequestDoPurchase requestDoParchase,
			ResponsePaymentProvider responsePaymentProvider) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponsePayment updateStockByRevert(RequestDoReversion requestDoReversion,
			ResponsePaymentProvider responsePaymentProvider) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean saveToken(ResponseTokenProvider responseTokenProvider, RequestDoPurchase requestDoParchase) {
		// TODO Auto-generated method stub
		return null;
	}

}
