package com.catstore.servicestore.dtos.payu;

public class RequestPayment extends RequestGeneric{

	private TransactionPayment transaction;

	/**
	 * @return the transaction
	 */
	public TransactionPayment getTransaction() {
		return transaction;
	}

	public static class Builder extends RequestGeneric.BuilderGeneric {
		private TransactionPayment transaction;

		public Builder withTransaction(TransactionPayment transaction) {
			this.transaction = transaction;
			return this;
		}

		public RequestPayment build() {
			return new RequestPayment(this);
		}
	}
	
	private RequestPayment(Builder builder) {
		super(builder);
		this.transaction = builder.transaction;
	}

}
