package com.catstore.servicestore.dtos.request;

public class CreditCardDto {

	private String number;

	private String scurityCode;

	private String expirationDate;

	private String name;

	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @return the scurityCode
	 */
	public String getScurityCode() {
		return scurityCode;
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
		private String scurityCode;
		private String expirationDate;
		private String name;

		public Builder number(String number) {
			this.number = number;
			return this;
		}

		public Builder scurityCode(String scurityCode) {
			this.scurityCode = scurityCode;
			return this;
		}

		public Builder expirationDate(String expirationDate) {
			this.expirationDate = expirationDate;
			return this;
		}

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public CreditCardDto build() {
			CreditCardDto creditCardDto = new CreditCardDto();
			creditCardDto.number = number;
			creditCardDto.scurityCode = scurityCode;
			creditCardDto.expirationDate = expirationDate;
			creditCardDto.name = name;
			return creditCardDto;
		}
	}

}
