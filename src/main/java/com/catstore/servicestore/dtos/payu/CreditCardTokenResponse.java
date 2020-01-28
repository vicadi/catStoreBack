package com.catstore.servicestore.dtos.payu;

public class CreditCardTokenResponse {
	
	private String creditCardTokenId;
	
	private String name;
	
	private String payerId;
	
	private String identificationNumber;
	
	private String paymentMethod;
	
	private String number;
	
	private String expirationDate;
	
	private String creationDate;
	
	private String maskedNumber;
	
	private String errorDescription;

	/**
	 * @return the creditCardTokenId
	 */
	public String getCreditCardTokenId() {
		return creditCardTokenId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the payerId
	 */
	public String getPayerId() {
		return payerId;
	}

	/**
	 * @return the identificationNumber
	 */
	public String getIdentificationNumber() {
		return identificationNumber;
	}

	/**
	 * @return the paymentMethod
	 */
	public String getPaymentMethod() {
		return paymentMethod;
	}

	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @return the expirationDate
	 */
	public String getExpirationDate() {
		return expirationDate;
	}

	/**
	 * @return the creationDate
	 */
	public String getCreationDate() {
		return creationDate;
	}

	/**
	 * @return the maskedNumber
	 */
	public String getMaskedNumber() {
		return maskedNumber;
	}

	/**
	 * @return the errorDescription
	 */
	public String getErrorDescription() {
		return errorDescription;
	}

	/**
	 * @param creditCardTokenId the creditCardTokenId to set
	 */
	public void setCreditCardTokenId(String creditCardTokenId) {
		this.creditCardTokenId = creditCardTokenId;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param payerId the payerId to set
	 */
	public void setPayerId(String payerId) {
		this.payerId = payerId;
	}

	/**
	 * @param identificationNumber the identificationNumber to set
	 */
	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

	/**
	 * @param paymentMethod the paymentMethod to set
	 */
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * @param expirationDate the expirationDate to set
	 */
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	/**
	 * @param creationDate the creationDate to set
	 */
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	/**
	 * @param maskedNumber the maskedNumber to set
	 */
	public void setMaskedNumber(String maskedNumber) {
		this.maskedNumber = maskedNumber;
	}

	/**
	 * @param errorDescription the errorDescription to set
	 */
	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}

}
