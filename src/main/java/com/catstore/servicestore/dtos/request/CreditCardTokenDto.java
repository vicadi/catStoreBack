package com.catstore.servicestore.dtos.request;

public class CreditCardTokenDto {

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

		public Builder payerId(String payerId) {
			this.payerId = payerId;
			return this;
		}

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder identificationNumber(String identificationNumber) {
			this.identificationNumber = identificationNumber;
			return this;
		}

		public Builder paymentMethod(String paymentMethod) {
			this.paymentMethod = paymentMethod;
			return this;
		}

		public Builder number(String number) {
			this.number = number;
			return this;
		}

		public Builder expirationDate(String expirationDate) {
			this.expirationDate = expirationDate;
			return this;
		}

		public CreditCardTokenDto build() {
			CreditCardTokenDto creditCardTokenDto = new CreditCardTokenDto();
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
