package com.catstore.servicestore.dtos.request;

import javax.validation.constraints.Min;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;

public class ExtraParametersDto {

	@JsonProperty("INSTALLMENTS_NUMBER")
	@NotNull
	@Min(1)
	private Integer installmentsNumber;

	/**
	 * @return the installmentsNumber
	 */
	public Integer getInstallmentsNumber() {
		return installmentsNumber;
	}

	public static class Builder {
		private Integer installmentsNumber;

		public Builder installmentsNumber(Integer installmentsNumber) {
			this.installmentsNumber = installmentsNumber;
			return this;
		}

		public ExtraParametersDto build() {
			ExtraParametersDto extraParametersDto = new ExtraParametersDto();
			extraParametersDto.installmentsNumber = installmentsNumber;
			return extraParametersDto;
		}
	}

}
