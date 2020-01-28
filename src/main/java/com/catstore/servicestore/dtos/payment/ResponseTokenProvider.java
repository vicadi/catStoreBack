package com.catstore.servicestore.dtos.payment;

public class ResponseTokenProvider {

	private String codeTransaction;

	private String messageError;

	private String creditCardTokenId;

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
	 * @return the creditCardTokenId
	 */
	public String getCreditCardTokenId() {
		return creditCardTokenId;
	}

	public static class Builder {
		private String codeTransaction;
		private String messageError;
		private String creditCardTokenId;

		public Builder withCodeTransaction(String codeTransaction) {
			this.codeTransaction = codeTransaction;
			return this;
		}

		public Builder withMessageError(String messageError) {
			this.messageError = messageError;
			return this;
		}

		public Builder withCreditCardTokenId(String creditCardTokenId) {
			this.creditCardTokenId = creditCardTokenId;
			return this;
		}

		public ResponseTokenProvider build() {
			ResponseTokenProvider responseTokenProvider = new ResponseTokenProvider();
			responseTokenProvider.codeTransaction = codeTransaction;
			responseTokenProvider.messageError = messageError;
			responseTokenProvider.creditCardTokenId = creditCardTokenId;
			return responseTokenProvider;
		}
	}

}
