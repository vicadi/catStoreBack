package com.catstore.servicestore.dtos.request;

public class RequestTokenDto {

	private String language;

	private String command;

	private MerchantDto merchant;

	private CreditCardTokenDto creditCardToken;

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
	 * @return the creditCardToken
	 */
	public CreditCardTokenDto getCreditCardToken() {
		return creditCardToken;
	}

	public static class Builder {
		private String language;
		private String command;
		private MerchantDto merchant;
		private CreditCardTokenDto creditCardToken;

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

		public Builder creditCardToken(CreditCardTokenDto creditCardToken) {
			this.creditCardToken = creditCardToken;
			return this;
		}

		public RequestTokenDto build() {
			RequestTokenDto requestTokenDto = new RequestTokenDto();
			requestTokenDto.language = language;
			requestTokenDto.command = command;
			requestTokenDto.merchant = merchant;
			requestTokenDto.creditCardToken = creditCardToken;
			return requestTokenDto;
		}
	}

}
