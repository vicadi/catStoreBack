package com.catstore.servicestore.dtos.payu;

import java.util.Map;

import com.catstore.servicestore.enums.TypeCard;

public class TransactionPayment {

	private OrderPayment order;

	private Payer payer;

	private CreditCardPayment creditCard;
	
	private String creditCardTokenId;

	private Map<String, String> extraParameters;

	private String type;

	private TypeCard paymentMethod;

	private String paymentCountry;

	/**
	 * @return the order
	 */
	public OrderPayment getOrder() {
		return order;
	}

	/**
	 * @return the payer
	 */
	public Payer getPayer() {
		return payer;
	}

	/**
	 * @return the creditCard
	 */
	public CreditCardPayment getCreditCard() {
		return creditCard;
	}

	/**
	 * @return the creditCardTokenId
	 */
	public String getCreditCardTokenId() {
		return creditCardTokenId;
	}

	/**
	 * @return the extraParameters
	 */
	public Map<String, String> getExtraParameters() {
		return extraParameters;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @return the paymentMethod
	 */
	public TypeCard getPaymentMethod() {
		return paymentMethod;
	}

	/**
	 * @return the paymentCountry
	 */
	public String getPaymentCountry() {
		return paymentCountry;
	}

	public static class Builder {
		private OrderPayment order;
		private Payer payer;
		private CreditCardPayment creditCard;
		private String creditCardTokenId;
		private Map<String, String> extraParameters;
		private String type;
		private TypeCard paymentMethod;
		private String paymentCountry;

		public Builder withOrder(OrderPayment order) {
			this.order = order;
			return this;
		}

		public Builder withPayer(Payer payer) {
			this.payer = payer;
			return this;
		}

		public Builder withCreditCard(CreditCardPayment creditCard) {
			this.creditCard = creditCard;
			return this;
		}
		
		public Builder withCreditCard(String creditCardTokenId) {
			this.creditCardTokenId = creditCardTokenId;
			return this;
		}

		public Builder withExtraParameters(Map<String, String> extraParameters) {
			this.extraParameters = extraParameters;
			return this;
		}

		public Builder withType(String type) {
			this.type = type;
			return this;
		}

		public Builder withPaymentMethod(TypeCard paymentMethod) {
			this.paymentMethod = paymentMethod;
			return this;
		}

		public Builder withPaymentCountry(String paymentCountry) {
			this.paymentCountry = paymentCountry;
			return this;
		}

		public TransactionPayment build() {
			TransactionPayment transactionDto = new TransactionPayment();
			transactionDto.order = order;
			transactionDto.payer = payer;
			transactionDto.creditCard = creditCard;
			transactionDto.creditCardTokenId = creditCardTokenId;
			transactionDto.extraParameters = extraParameters;
			transactionDto.type = type;
			transactionDto.paymentMethod = paymentMethod;
			transactionDto.paymentCountry = paymentCountry;
			return transactionDto;
		}
	}

}
