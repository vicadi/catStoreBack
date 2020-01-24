package com.catstore.servicestore.services;

import org.springframework.http.ResponseEntity;

import com.catstore.servicestore.dtos.request.RequestDoPurchaseDto;
import com.catstore.servicestore.dtos.response.ResponseDefaultDto;

public interface PaymentService {
	
	ResponseEntity<ResponseDefaultDto> doPurchase(RequestDoPurchaseDto requestDoParchase);
	
	ResponseEntity<ResponseDefaultDto> doReversion(Integer idPurchase);

}
