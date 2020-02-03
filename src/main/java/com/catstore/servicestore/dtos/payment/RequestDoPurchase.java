package com.catstore.servicestore.dtos.payment;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class RequestDoPurchase {
	
	@NotNull
	private Boolean hasToken;

	@NotNull
	private Boolean tokenizedCreditCard;

	@NotNull
	@NotEmpty
	private String referenceCode;

	@NotNull
	@NotEmpty
	private String description;

	@Valid
	@NotNull
	private Customer customerData;

	@Valid
	private CreditCardData creditCard;
	
	private String creditCardToken;

	@NotNull
	@NotEmpty
	private String paymentCountry;

	@Valid
	@NotNull
	@NotEmpty
	private List<ProductDetail> listProducts;

	/**
	 * @return the tokenizedCreditCard
	 */
	public Boolean getTokenizedCreditCard() {
		return tokenizedCreditCard;
	}

	/**
	 * @return the referenceCode
	 */
	public String getReferenceCode() {
		return referenceCode;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the customerData
	 */
	public Customer getCustomerData() {
		return customerData;
	}

	/**
	 * @return the creditCard
	 */
	public CreditCardData getCreditCard() {
		return creditCard;
	}

	/**
	 * @return the hasToken
	 */
	public Boolean getHasToken() {
		return hasToken;
	}

	/**
	 * @return the creditCardToken
	 */
	public String getCreditCardToken() {
		return creditCardToken;
	}

	/**
	 * @return the paymentCountry
	 */
	public String getPaymentCountry() {
		return paymentCountry;
	}

	/**
	 * @return the listProducts
	 */
	public List<ProductDetail> getListProducts() {
		return listProducts;
	}

	/**
	 * @param tokenizedCreditCard the tokenizedCreditCard to set
	 */
	public void setTokenizedCreditCard(Boolean tokenizedCreditCard) {
		this.tokenizedCreditCard = tokenizedCreditCard;
	}

	/**
	 * @param referenceCode the referenceCode to set
	 */
	public void setReferenceCode(String referenceCode) {
		this.referenceCode = referenceCode;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @param customerData the customerData to set
	 */
	public void setCustomerData(Customer customerData) {
		this.customerData = customerData;
	}

	/**
	 * @param creditCard the creditCard to set
	 */
	public void setCreditCard(CreditCardData creditCard) {
		this.creditCard = creditCard;
	}

	/**
	 * @param paymentCountry the paymentCountry to set
	 */
	public void setPaymentCountry(String paymentCountry) {
		this.paymentCountry = paymentCountry;
	}

	/**
	 * @param listProducts the listProducts to set
	 */
	public void setListProducts(List<ProductDetail> listProducts) {
		this.listProducts = listProducts;
	}

	/**
	 * @param hasToken the hasToken to set
	 */
	public void setHasToken(Boolean hasToken) {
		this.hasToken = hasToken;
	}

	/**
	 * @param creditCardToken the creditCardToken to set
	 */
	public void setCreditCardToken(String creditCardToken) {
		this.creditCardToken = creditCardToken;
	}

}
