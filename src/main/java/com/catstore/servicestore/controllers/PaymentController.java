package com.catstore.servicestore.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.catstore.servicestore.dtos.payment.RequestDoPurchase;
import com.catstore.servicestore.dtos.payment.RequestDoReversion;
import com.catstore.servicestore.dtos.payment.ResponsePayment;
import com.catstore.servicestore.services.PaymentService;

@RestController
@RequestMapping(value = "/payment")
public class PaymentController {
	
	@Autowired
	private PaymentService paymentService;
	
	@RequestMapping(value = "/doPurchase", method = RequestMethod.POST)
	public ResponseEntity<ResponsePayment> doPurchase(@Valid @RequestBody RequestDoPurchase requestDoPurchase) {
		return paymentService.doPurchase(requestDoPurchase);
	}
	
	@RequestMapping(value = "/doReversion", method = RequestMethod.POST)
	public ResponseEntity<ResponsePayment> doReversion(@Valid @RequestBody RequestDoReversion requestDoReversion) {
		return paymentService.doReversion(requestDoReversion);
	}

}
