package com.catstore.servicestore.dtos.payment;

public class ResponsePayment {

	private Integer status;

	private String description;

	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	public static class Builder {
		private Integer status;
		private String description;

		public Builder status(Integer status) {
			this.status = status;
			return this;
		}

		public Builder description(String description) {
			this.description = description;
			return this;
		}

		public ResponsePayment build() {
			ResponsePayment responseDefaultDto = new ResponsePayment();
			responseDefaultDto.status = status;
			responseDefaultDto.description = description;
			return responseDefaultDto;
		}
	}

}
