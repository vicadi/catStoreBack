package com.catstore.servicestore.dtos.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AdditionalValuesDto {

	@JsonProperty("TX_VALUE")
	private TxValueDto txValue;

	/**
	 * @return the txValue
	 */
	public TxValueDto getTxValue() {
		return txValue;
	}

	public static class Builder {
		private TxValueDto txValue;

		public Builder txValue(TxValueDto txValue) {
			this.txValue = txValue;
			return this;
		}

		public AdditionalValuesDto build() {
			AdditionalValuesDto additionalValuesDto = new AdditionalValuesDto();
			additionalValuesDto.txValue = txValue;
			return additionalValuesDto;
		}
	}

}
