package com.catstore.servicestore.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.catstore.servicestore.dtos.request.RequestDoPurchaseDto;
import com.catstore.servicestore.dtos.response.ResponseDefaultDto;

@RestController
@RequestMapping(value = "/payment")
public class PaymentController {
	
	@RequestMapping(value = "/doPurchase", method = RequestMethod.POST)
	public ResponseEntity<ResponseDefaultDto> doPurchase(@RequestBody RequestDoPurchaseDto request) {
		return null;
	}

}
