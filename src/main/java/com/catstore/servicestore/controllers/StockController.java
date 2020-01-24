package com.catstore.servicestore.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/stock")
public class StockController {
	
	@RequestMapping(value = "/healthy", method = RequestMethod.GET)
	public String healthy() {
		return "OK";
	}

}
