package com.catstore.servicestore.dtos.payment;

import javax.validation.constraints.NotEmpty;

import com.sun.istack.NotNull;

public class RequestDoReversion {
	
	@NotNull
	@NotEmpty
	private String orderId;
	
	@NotNull
	@NotEmpty
	private String transactionId;

	/**
	 * @return the orderId
	 */
	public String getOrderId() {
		return orderId;
	}

	/**
	 * @return the transactionId
	 */
	public String getTransactionId() {
		return transactionId;
	}

	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	/**
	 * @param transactionId the transactionId to set
	 */
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

}
