package com.catstore.servicestore.dtos.payu;

public class OrderRefund {

	private String id;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	public static class Builder {
		private String id;

		public Builder withId(String id) {
			this.id = id;
			return this;
		}

		public OrderRefund build() {
			OrderRefund orderRefundDto = new OrderRefund();
			orderRefundDto.id = id;
			return orderRefundDto;
		}
	}

}
