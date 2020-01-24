package com.catstore.servicestore.dtos.request;

public class TransactionDto {

	private OrderDto order;

	private PayerDto payer;

	private CreditCardDto creditCard;

	private ExtraParametersDto extraParameters;

	private String type;

	private String paymentMethod;

	private String paymentCountry;

	private String parentTransactionId;

	/**
	 * @return the order
	 */
	public OrderDto getOrder() {
		return order;
	}

	/**
	 * @return the payer
	 */
	public PayerDto getPayer() {
		return payer;
	}

	/**
	 * @return the creditCard
	 */
	public CreditCardDto getCreditCard() {
		return creditCard;
	}

	/**
	 * @return the extraParameters
	 */
	public ExtraParametersDto getExtraParameters() {
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
	public String getPaymentMethod() {
		return paymentMethod;
	}

	/**
	 * @return the paymentCountry
	 */
	public String getPaymentCountry() {
		return paymentCountry;
	}

	/**
	 * @return the parentTransactionId
	 */
	public String getParentTransactionId() {
		return parentTransactionId;
	}

	public static class Builder {
		private OrderDto order;
		private PayerDto payer;
		private CreditCardDto creditCard;
		private ExtraParametersDto extraParameters;
		private String type;
		private String paymentMethod;
		private String paymentCountry;
		private String parentTransactionId;

		public Builder order(OrderDto order) {
			this.order = order;
			return this;
		}

		public Builder payer(PayerDto payer) {
			this.payer = payer;
			return this;
		}

		public Builder creditCard(CreditCardDto creditCard) {
			this.creditCard = creditCard;
			return this;
		}

		public Builder extraParameters(ExtraParametersDto extraParameters) {
			this.extraParameters = extraParameters;
			return this;
		}

		public Builder type(String type) {
			this.type = type;
			return this;
		}

		public Builder paymentMethod(String paymentMethod) {
			this.paymentMethod = paymentMethod;
			return this;
		}

		public Builder paymentCountry(String paymentCountry) {
			this.paymentCountry = paymentCountry;
			return this;
		}

		public Builder parentTransactionId(String parentTransactionId) {
			this.parentTransactionId = parentTransactionId;
			return this;
		}

		public TransactionDto build() {
			TransactionDto transactionDto = new TransactionDto();
			transactionDto.order = order;
			transactionDto.payer = payer;
			transactionDto.creditCard = creditCard;
			transactionDto.extraParameters = extraParameters;
			transactionDto.type = type;
			transactionDto.paymentMethod = paymentMethod;
			transactionDto.paymentCountry = paymentCountry;
			transactionDto.parentTransactionId = parentTransactionId;
			return transactionDto;
		}
	}

}
