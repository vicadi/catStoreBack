package com.catstore.servicestore.dtos.payu;

public class TxValue {

	private Integer value;

	private String currency;

	/**
	 * @return the value
	 */
	public Integer getValue() {
		return value;
	}

	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}

	public static class Builder {
		private Integer value;
		private String currency;

		public Builder withValue(Integer value) {
			this.value = value;
			return this;
		}

		public Builder withCurrency(String currency) {
			this.currency = currency;
			return this;
		}

		public TxValue build() {
			TxValue txValueDto = new TxValue();
			txValueDto.value = value;
			txValueDto.currency = currency;
			return txValueDto;
		}
	}

}
