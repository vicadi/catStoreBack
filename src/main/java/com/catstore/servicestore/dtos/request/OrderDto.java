package com.catstore.servicestore.dtos.request;

public class OrderDto {

	private String id;

	private String accountId;

	private String referenceCode;

	private String description;

	private String language;

	private AdditionalValuesDto additionalValues;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

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
	public AdditionalValuesDto getAdditionalValues() {
		return additionalValues;
	}

	public static class Builder {
		private String id;
		private String accountId;
		private String referenceCode;
		private String description;
		private String language;
		private AdditionalValuesDto additionalValues;

		public Builder id(String id) {
			this.id = id;
			return this;
		}

		public Builder accountId(String accountId) {
			this.accountId = accountId;
			return this;
		}

		public Builder referenceCode(String referenceCode) {
			this.referenceCode = referenceCode;
			return this;
		}

		public Builder description(String description) {
			this.description = description;
			return this;
		}

		public Builder language(String language) {
			this.language = language;
			return this;
		}

		public Builder additionalValues(AdditionalValuesDto additionalValues) {
			this.additionalValues = additionalValues;
			return this;
		}

		public OrderDto build() {
			OrderDto orderDto = new OrderDto();
			orderDto.id = id;
			orderDto.accountId = accountId;
			orderDto.referenceCode = referenceCode;
			orderDto.description = description;
			orderDto.language = language;
			orderDto.additionalValues = additionalValues;
			return orderDto;
		}
	}

}
