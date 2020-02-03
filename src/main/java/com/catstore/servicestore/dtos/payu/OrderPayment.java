package com.catstore.servicestore.dtos.payu;

public class OrderPayment {

	private String accountId;

	private String referenceCode;

	private String description;

	private String language;

	private AdditionalValues additionalValues;

	/**
	 * @return the accountId
	 */
	public String getAccountId() {
		return accountId;
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
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * @return the additionalValues
	 */
	public AdditionalValues getAdditionalValues() {
		return additionalValues;
	}

	public static class Builder {
		private String accountId;
		private String referenceCode;
		private String description;
		private String language;
		private AdditionalValues additionalValues;

		public Builder withAccountId(String accountId) {
			this.accountId = accountId;
			return this;
		}

		public Builder withReferenceCode(String referenceCode) {
			this.referenceCode = referenceCode;
			return this;
		}

		public Builder withDescription(String description) {
			this.description = description;
			return this;
		}

		public Builder withLanguage(String language) {
			this.language = language;
			return this;
		}

		public Builder withAdditionalValues(AdditionalValues additionalValues) {
			this.additionalValues = additionalValues;
			return this;
		}

		public OrderPayment build() {
			OrderPayment orderDto = new OrderPayment();
			orderDto.accountId = accountId;
			orderDto.referenceCode = referenceCode;
			orderDto.description = description;
			orderDto.language = language;
			orderDto.additionalValues = additionalValues;
			return orderDto;
		}
	}

}
