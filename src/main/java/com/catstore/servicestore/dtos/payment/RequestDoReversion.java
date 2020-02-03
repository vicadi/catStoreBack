package com.catstore.servicestore.dtos.payment;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


public class RequestDoReversion {
	
	@NotNull
	private Integer purchaseId;
	
	@NotNull
	@NotEmpty
	private String orderId;
	
	@NotNull
	@NotEmpty
	private String transactionId;

	/**
	 * @return the purchaseId
	 */
	public Integer getPurchaseId() {
		return purchaseId;
	}

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
	 * @param purchaseId the purchaseId to set
	 */
	public void setPurchaseId(Integer purchaseId) {
		this.purchaseId = purchaseId;
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
