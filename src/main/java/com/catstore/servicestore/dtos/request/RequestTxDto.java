package com.catstore.servicestore.dtos.request;

public class RequestTxDto {

	private String language;

	private String command;

	private MerchantDto merchant;

	private TransactionDto transaction;

	private Boolean test;

	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * @return the command
	 */
	public String getCommand() {
		return command;
	}

	/**
	 * @return the merchant
	 */
	public MerchantDto getMerchant() {
		return merchant;
	}

	/**
	 * @return the transaction
	 */
	public TransactionDto getTransaction() {
		return transaction;
	}

	/**
	 * @return the test
	 */
	public Boolean getTest() {
		return test;
	}

	public static class Builder {
		private String language;
		private String command;
		private MerchantDto merchant;
		private TransactionDto transaction;
		private Boolean test;

		public Builder language(String language) {
			this.language = language;
			return this;
		}

		public Builder command(String command) {
			this.command = command;
			return this;
		}

		public Builder merchant(MerchantDto merchant) {
			this.merchant = merchant;
			return this;
		}

		public Builder transaction(TransactionDto transaction) {
			this.transaction = transaction;
			return this;
		}

		public Builder test(Boolean test) {
			this.test = test;
			return this;
		}

		public RequestTxDto build() {
			RequestTxDto requestTxDto = new RequestTxDto();
			requestTxDto.language = language;
			requestTxDto.command = command;
			requestTxDto.merchant = merchant;
			requestTxDto.transaction = transaction;
			requestTxDto.test = test;
			return requestTxDto;
		}
	}

}
