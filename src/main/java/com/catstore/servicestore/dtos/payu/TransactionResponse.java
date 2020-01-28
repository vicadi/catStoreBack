package com.catstore.servicestore.dtos.payu;

import java.util.Map;

public class TransactionResponse {
	
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
	
	private Map<String, String> extraParameters;

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
	public Map<String, String> getExtraParameters() {
		return extraParameters;
	}

}
