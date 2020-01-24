package com.catstore.servicestore.dtos.request;

import javax.validation.constraints.NotEmpty;

import com.sun.istack.NotNull;

public class OrderRefundDto {

	@NotNull
	@NotEmpty
	private String id;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	public static class Builder {
		private String id;

		public Builder id(String id) {
			this.id = id;
			return this;
		}

		public OrderRefundDto build() {
			OrderRefundDto orderRefundDto = new OrderRefundDto();
			orderRefundDto.id = id;
			return orderRefundDto;
		}
	}

}
