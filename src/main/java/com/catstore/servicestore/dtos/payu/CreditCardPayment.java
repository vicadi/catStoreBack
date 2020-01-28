package com.catstore.servicestore.dtos.payu;

public class CreditCardPayment {

	private String number;

	private String securityCode;

	private String expirationDate;

	private String name;

	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @return the securityCode
	 */
	public String getSecurityCode() {
		return securityCode;
	}

	/**
	 * @return the expirationDate
	 */
	public String getExpirationDate() {
		return expirationDate;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	public static class Builder {
		private String number;
		private String securityCode;
		private String expirationDate;
		private String name;

		public Builder withNumber(String number) {
			this.number = number;
			return this;
		}

		public Builder withSecurityCode(String securityCode) {
			this.securityCode = securityCode;
			return this;
		}

		public Builder withExpirationDate(String expirationDate) {
			this.expirationDate = expirationDate;
			return this;
		}

		public Builder withName(String name) {
			this.name = name;
			return this;
		}

		public CreditCardPayment build() {
			CreditCardPayment creditCardDto = new CreditCardPayment();
			creditCardDto.number = number;
			creditCardDto.securityCode = securityCode;
			creditCardDto.expirationDate = expirationDate;
			creditCardDto.name = name;
			return creditCardDto;
		}
	}

}
