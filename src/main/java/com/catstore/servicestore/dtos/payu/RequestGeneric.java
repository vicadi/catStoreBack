package com.catstore.servicestore.dtos.payu;

public class RequestGeneric {

	private String language;

	private String command;

	private Merchant merchant;
	
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
	public Merchant getMerchant() {
		return merchant;
	}
	
	/**
	 * @return the test
	 */
	public Boolean getTest() {
		return test;
	}

	public static class BuilderGeneric {
		private String language;
		private String command;
		private Merchant merchant;
		private Boolean test;

		public BuilderGeneric withLanguage(String language) {
			this.language = language;
			return this;
		}

		public BuilderGeneric withCommand(String command) {
			this.command = command;
			return this;
		}

		public BuilderGeneric withMerchant(Merchant merchant) {
			this.merchant = merchant;
			return this;
		}
		
		public BuilderGeneric withTest(Boolean test) {
			this.test = test;
			return this;
		}

		public RequestGeneric build() {
			return new RequestGeneric(this);
		}
	}
	
	protected RequestGeneric(BuilderGeneric build) {
		this.language = build.language;
		this.command = build.command;
		this.merchant = build.merchant;
		this.test = build.test;
	}

}
