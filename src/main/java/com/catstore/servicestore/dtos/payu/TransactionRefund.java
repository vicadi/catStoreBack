package com.catstore.servicestore.dtos.payu;

public class TransactionRefund {

	private OrderRefund order;

	private String type;

	private String parentTransactionId;

	/**
	 * @return the order
	 */
	public OrderRefund getOrder() {
		return order;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @return the parentTransactionId
	 */
	public String getParentTransactionId() {
		return parentTransactionId;
	}

	public static class Builder {
		private OrderRefund order;
		private String type;
		private String parentTransactionId;

		public Builder withOrder(OrderRefund order) {
			this.order = order;
			return this;
		}

		public Builder withType(String type) {
			this.type = type;
			return this;
		}

		public Builder withParentTransactionId(String parentTransactionId) {
			this.parentTransactionId = parentTransactionId;
			return this;
		}

		public TransactionRefund build() {
			TransactionRefund transactionRefundDto = new TransactionRefund();
			transactionRefundDto.order = order;
			transactionRefundDto.type = type;
			transactionRefundDto.parentTransactionId = parentTransactionId;
			return transactionRefundDto;
		}
	}

}
