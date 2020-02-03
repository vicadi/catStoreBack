package com.catstore.servicestore.dtos.payu;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AdditionalValues {

	@JsonProperty("TX_VALUE")
	private TxValue txValue;

	/**
	 * @return the txValue
	 */
	public TxValue getTxValue() {
		return txValue;
	}

	public static class Builder {
		private TxValue txValue;

		public Builder withTxValue(TxValue txValue) {
			this.txValue = txValue;
			return this;
		}

		public AdditionalValues build() {
			AdditionalValues additionalValuesDto = new AdditionalValues();
			additionalValuesDto.txValue = txValue;
			return additionalValuesDto;
		}
	}

}
