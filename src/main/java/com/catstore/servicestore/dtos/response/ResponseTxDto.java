package com.catstore.servicestore.dtos.response;

public class ResponseTxDto {
	
	private String code;
	
	private String error;
	
	private TransactionResponseDto transactionResponse;

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
	public TransactionResponseDto getTransactionResponse() {
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
	public void setTransactionResponse(TransactionResponseDto transactionResponse) {
		this.transactionResponse = transactionResponse;
	}

}
