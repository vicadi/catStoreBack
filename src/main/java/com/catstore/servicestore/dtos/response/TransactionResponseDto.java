package com.catstore.servicestore.dtos.response;

public class TransactionResponseDto {
	
	private String orderId;
	
	private String transactionId;
	
	private String state;
	
	private String paymentNetworkResponseCode;
	
	private String paymentNetworkResponseErrorMessage;
	
	private String trazabilityCode;
	
	private String authorizationCode;
	
	private String pendingReason;
	
	private String responseCode;
	
	private String errorCode;
	
	private String responseMessage;
	
	private String transactionDate;
	
	private String transactionTime;
	
	private String operationDate;
	
	private String extraParameters;

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
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @return the paymentNetworkResponseCode
	 */
	public String getPaymentNetworkResponseCode() {
		return paymentNetworkResponseCode;
	}

	/**
	 * @return the paymentNetworkResponseErrorMessage
	 */
	public String getPaymentNetworkResponseErrorMessage() {
		return paymentNetworkResponseErrorMessage;
	}

	/**
	 * @return the trazabilityCode
	 */
	public String getTrazabilityCode() {
		return trazabilityCode;
	}

	/**
	 * @return the authorizationCode
	 */
	public String getAuthorizationCode() {
		return authorizationCode;
	}

	/**
	 * @return the pendingReason
	 */
	public String getPendingReason() {
		return pendingReason;
	}

	/**
	 * @return the responseCode
	 */
	public String getResponseCode() {
		return responseCode;
	}

	/**
	 * @return the errorCode
	 */
	public String getErrorCode() {
		return errorCode;
	}

	/**
	 * @return the responseMessage
	 */
	public String getResponseMessage() {
		return responseMessage;
	}

	/**
	 * @return the transactionDate
	 */
	public String getTransactionDate() {
		return transactionDate;
	}

	/**
	 * @return the transactionTime
	 */
	public String getTransactionTime() {
		return transactionTime;
	}

	/**
	 * @return the operationDate
	 */
	public String getOperationDate() {
		return operationDate;
	}

	/**
	 * @return the extraParameters
	 */
	public String getExtraParameters() {
		return extraParameters;
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

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @param paymentNetworkResponseCode the paymentNetworkResponseCode to set
	 */
	public void setPaymentNetworkResponseCode(String paymentNetworkResponseCode) {
		this.paymentNetworkResponseCode = paymentNetworkResponseCode;
	}

	/**
	 * @param paymentNetworkResponseErrorMessage the paymentNetworkResponseErrorMessage to set
	 */
	public void setPaymentNetworkResponseErrorMessage(String paymentNetworkResponseErrorMessage) {
		this.paymentNetworkResponseErrorMessage = paymentNetworkResponseErrorMessage;
	}

	/**
	 * @param trazabilityCode the trazabilityCode to set
	 */
	public void setTrazabilityCode(String trazabilityCode) {
		this.trazabilityCode = trazabilityCode;
	}

	/**
	 * @param authorizationCode the authorizationCode to set
	 */
	public void setAuthorizationCode(String authorizationCode) {
		this.authorizationCode = authorizationCode;
	}

	/**
	 * @param pendingReason the pendingReason to set
	 */
	public void setPendingReason(String pendingReason) {
		this.pendingReason = pendingReason;
	}

	/**
	 * @param responseCode the responseCode to set
	 */
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	/**
	 * @param errorCode the errorCode to set
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	/**
	 * @param responseMessage the responseMessage to set
	 */
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	/**
	 * @param transactionDate the transactionDate to set
	 */
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	/**
	 * @param transactionTime the transactionTime to set
	 */
	public void setTransactionTime(String transactionTime) {
		this.transactionTime = transactionTime;
	}

	/**
	 * @param operationDate the operationDate to set
	 */
	public void setOperationDate(String operationDate) {
		this.operationDate = operationDate;
	}

	/**
	 * @param extraParameters the extraParameters to set
	 */
	public void setExtraParameters(String extraParameters) {
		this.extraParameters = extraParameters;
	}

}
