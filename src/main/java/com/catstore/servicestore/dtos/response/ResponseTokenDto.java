package com.catstore.servicestore.dtos.response;

public class ResponseTokenDto {
	
	private String code;
	
	private String error;
	
	private CreditCardTokenResponseDto creditCardToken;

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
	 * @return the creditCardToken
	 */
	public CreditCardTokenResponseDto getCreditCardToken() {
		return creditCardToken;
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
	 * @param creditCardToken the creditCardToken to set
	 */
	public void setCreditCardToken(CreditCardTokenResponseDto creditCardToken) {
		this.creditCardToken = creditCardToken;
	}

}
