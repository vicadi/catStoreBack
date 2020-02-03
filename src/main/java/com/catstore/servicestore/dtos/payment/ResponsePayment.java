package com.catstore.servicestore.dtos.payment;

public class ResponsePayment {

	private String status;

	private String description;

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	public static class Builder {
		private String status;
		private String description;

		public Builder withStatus(String status) {
			this.status = status;
			return this;
		}

		public Builder withDescription(String description) {
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
