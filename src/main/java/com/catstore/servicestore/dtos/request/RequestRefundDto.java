package com.catstore.servicestore.dtos.request;

import javax.validation.Valid;

public class RequestRefundDto {

	private String language;

	private String command;

	private MerchantDto merchant;

	@Valid
	private TransactionRefundDto transaction;

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
	public TransactionRefundDto getTransaction() {
		return transaction;
	}

	public static class Builder {
		private String language;
		private String command;
		private MerchantDto merchant;
		private TransactionRefundDto transaction;

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

		public Builder transaction(TransactionRefundDto transaction) {
			this.transaction = transaction;
			return this;
		}

		public RequestRefundDto build() {
			RequestRefundDto requestRefundDto = new RequestRefundDto();
			requestRefundDto.language = language;
			requestRefundDto.command = command;
			requestRefundDto.merchant = merchant;
			requestRefundDto.transaction = transaction;
			return requestRefundDto;
		}
	}

}
