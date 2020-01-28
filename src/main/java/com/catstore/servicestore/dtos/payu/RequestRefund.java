package com.catstore.servicestore.dtos.payu;

public class RequestRefund extends RequestGeneric{

	private TransactionRefund transaction;

	/**
	 * @return the transaction
	 */
	public TransactionRefund getTransaction() {
		return transaction;
	}

	public static class Builder extends RequestGeneric.BuilderGeneric {
		private TransactionRefund transaction;

		public Builder withTransaction(TransactionRefund transaction) {
			this.transaction = transaction;
			return this;
		}

		public RequestRefund build() {
			return new RequestRefund(this);
		}
	}
	
	private RequestRefund(Builder builder) {
		super(builder);
		this.transaction = builder.transaction;
	}

}
