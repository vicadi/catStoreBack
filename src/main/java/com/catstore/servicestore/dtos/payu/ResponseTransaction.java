package com.catstore.servicestore.dtos.payu;

public class ResponseTransaction {
	
	private String code;
	
	private String error;
	
	private TransactionResponse transactionResponse;

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @return the error
	 */
	public String getError() {
		return error;
	}

	/**
	 * @return the transactionResponse
	 */
	public TransactionResponse getTransactionResponse() {
		return transactionResponse;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @param error the error to set
	 */
	public void setError(String error) {
		this.error = error;
	}

	/**
	 * @param transactionResponse the transactionResponse to set
	 */
	public void setTransactionResponse(TransactionResponse transactionResponse) {
		this.transactionResponse = transactionResponse;
	}

}
