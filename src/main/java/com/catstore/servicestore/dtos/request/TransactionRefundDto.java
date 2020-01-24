package com.catstore.servicestore.dtos.request;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

import com.sun.istack.NotNull;

public class TransactionRefundDto {

	@Valid
	private OrderRefundDto order;

	private String type;

	@NotNull
	@NotEmpty
	private String parentTransactionId;

	/**
	 * @return the order
	 */
	public OrderRefundDto getOrder() {
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
		private OrderRefundDto order;
		private String type;
		private String parentTransactionId;

		public Builder order(OrderRefundDto order) {
			this.order = order;
			return this;
		}

		public Builder type(String type) {
			this.type = type;
			return this;
		}

		public Builder parentTransactionId(String parentTransactionId) {
			this.parentTransactionId = parentTransactionId;
			return this;
		}

		public TransactionRefundDto build() {
			TransactionRefundDto transactionRefundDto = new TransactionRefundDto();
			transactionRefundDto.order = order;
			transactionRefundDto.type = type;
			transactionRefundDto.parentTransactionId = parentTransactionId;
			return transactionRefundDto;
		}
	}

}
