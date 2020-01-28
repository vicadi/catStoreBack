package com.catstore.servicestore.dtos.payu;

public class CreditCardToken {

	private String payerId;

	private String name;

	private String identificationNumber;

	private String paymentMethod;

	private String number;

	private String expirationDate;

	/**
	 * @return the payerId
	 */
	public String getPayerId() {
		return payerId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
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

	public static class Builder {
		private String payerId;
		private String name;
		private String identificationNumber;
		private String paymentMethod;
		private String number;
		private String expirationDate;

		public Builder withPayerId(String payerId) {
			this.payerId = payerId;
			return this;
		}

		public Builder withName(String name) {
			this.name = name;
			return this;
		}

		public Builder withIdentificationNumber(String identificationNumber) {
			this.identificationNumber = identificationNumber;
			return this;
		}

		public Builder withPaymentMethod(String paymentMethod) {
			this.paymentMethod = paymentMethod;
			return this;
		}

		public Builder withNumber(String number) {
			this.number = number;
			return this;
		}

		public Builder withExpirationDate(String expirationDate) {
			this.expirationDate = expirationDate;
			return this;
		}

		public CreditCardToken build() {
			CreditCardToken creditCardTokenDto = new CreditCardToken();
			creditCardTokenDto.payerId = payerId;
			creditCardTokenDto.name = name;
			creditCardTokenDto.identificationNumber = identificationNumber;
			creditCardTokenDto.paymentMethod = paymentMethod;
			creditCardTokenDto.number = number;
			creditCardTokenDto.expirationDate = expirationDate;
			return creditCardTokenDto;
		}
	}

}
