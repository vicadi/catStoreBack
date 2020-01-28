package com.catstore.servicestore.dtos.payu;

public class ResponseToken {
	
	private String code;
	
	private String error;
	
	private CreditCardTokenResponse creditCardToken;

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
	public CreditCardTokenResponse getCreditCardToken() {
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
	public void setCreditCardToken(CreditCardTokenResponse creditCardToken) {
		this.creditCardToken = creditCardToken;
	}

}
