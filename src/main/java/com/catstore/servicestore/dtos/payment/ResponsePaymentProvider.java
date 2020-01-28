package com.catstore.servicestore.dtos.payment;

public class ResponsePaymentProvider {

	private String codeTransaction;

	private String messageError;

	private String orderId;

	private String transactionId;

	private String state;

	private String trazabilityCode;
	
	private String pendingReason;

	/**
	 * @return the codeTransaction
	 */
	public String getCodeTransaction() {
		return codeTransaction;
	}

	/**
	 * @return the messageError
	 */
	public String getMessageError() {
		return messageError;
	}

	/**
	 * @return the orderId
	 */
	public String getOrderId() {
		return orderId;
	}

	/**
	 * @return the transactionId
	 */
	public String getTransactionId() {
		return transactionId;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @return the trazabilityCode
	 */
	public String getTrazabilityCode() {
		return trazabilityCode;
	}

	/**
	 * @return the pendingReason
	 */
	public String getPendingReason() {
		return pendingReason;
	}

	public static class Builder {
		private String codeTransaction;
		private String messageError;
		private String orderId;
		private String transactionId;
		private String state;
		private String trazabilityCode;
		private String pendingReason;

		public Builder withCodeTransaction(String codeTransaction) {
			this.codeTransaction = codeTransaction;
			return this;
		}

		public Builder withMessageError(String messageError) {
			this.messageError = messageError;
			return this;
		}

		public Builder withOrderId(String orderId) {
			this.orderId = orderId;
			return this;
		}

		public Builder withTransactionId(String transactionId) {
			this.transactionId = transactionId;
			return this;
		}

		public Builder withState(String state) {
			this.state = state;
			return this;
		}

		public Builder withTrazabilityCode(String trazabilityCode) {
			this.trazabilityCode = trazabilityCode;
			return this;
		}
		
		public Builder withPendingReason(String pendingReason) {
			this.pendingReason = pendingReason;
			return this;
		}


		public ResponsePaymentProvider build() {
			ResponsePaymentProvider responsePaymentProvider = new ResponsePaymentProvider();
			responsePaymentProvider.codeTransaction = codeTransaction;
			responsePaymentProvider.messageError = messageError;
			responsePaymentProvider.orderId = orderId;
			responsePaymentProvider.transactionId = transactionId;
			responsePaymentProvider.state = state;
			responsePaymentProvider.trazabilityCode = trazabilityCode;
			responsePaymentProvider.pendingReason = pendingReason;
			return responsePaymentProvider;
		}
	}

}
