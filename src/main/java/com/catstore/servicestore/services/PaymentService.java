package com.catstore.servicestore.services;

import org.springframework.http.ResponseEntity;

import com.catstore.servicestore.dtos.payment.RequestDoPurchase;
import com.catstore.servicestore.dtos.payment.RequestDoReversion;
import com.catstore.servicestore.dtos.payment.ResponsePayment;

public interface PaymentService {
	
	ResponseEntity<ResponsePayment> doPurchase(RequestDoPurchase requestDoParchase);
	
	ResponseEntity<ResponsePayment> doReversion(RequestDoReversion requestReversion);

}
