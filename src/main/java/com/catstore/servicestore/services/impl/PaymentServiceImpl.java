package com.catstore.servicestore.services.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.catstore.servicestore.dtos.request.RequestDoPurchaseDto;
import com.catstore.servicestore.dtos.response.ResponseDefaultDto;
import com.catstore.servicestore.services.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Override
	public ResponseEntity<ResponseDefaultDto> doPurchase(RequestDoPurchaseDto requestDoParchase) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<ResponseDefaultDto> doReversion(Integer idPurchase) {
		// TODO Auto-generated method stub
		return null;
	}

}
