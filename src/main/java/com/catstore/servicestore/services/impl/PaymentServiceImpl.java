package com.catstore.servicestore.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.catstore.servicestore.UtilsTemp;
import com.catstore.servicestore.dtos.payment.RequestDoPurchase;
import com.catstore.servicestore.dtos.payment.RequestDoReversion;
import com.catstore.servicestore.dtos.payment.ResponsePayment;
import com.catstore.servicestore.services.PaymentProvider;
import com.catstore.servicestore.services.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {
	
	@Autowired
	private PaymentProvider paymentProviderService;

	@Override
	public ResponseEntity<ResponsePayment> doPurchase(RequestDoPurchase requestDoParchase) {
		UtilsTemp.printObject(paymentProviderService.doPay(requestDoParchase), "PAGO");
		UtilsTemp.printObject(paymentProviderService.generateToken(requestDoParchase.getCreditCard()), "TOKEN");
		return new ResponseEntity<ResponsePayment>(new ResponsePayment(), HttpStatus.OK); 
	}

	@Override
	public ResponseEntity<ResponsePayment> doReversion(RequestDoReversion requestReversion) {
		UtilsTemp.printObject(paymentProviderService.revertpay(requestReversion), "REVERSION");
		return new ResponseEntity<ResponsePayment>(new ResponsePayment(), HttpStatus.OK); 
	}

}
