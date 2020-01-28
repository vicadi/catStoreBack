package com.catstore.servicestore.dtos.payu;

public class Merchant {

	private String apiLogin;

	private String apiKey;

	/**
	 * @return the apiLogin
	 */
	public String getApiLogin() {
		return apiLogin;
	}

	/**
	 * @return the apiKey
	 */
	public String getApiKey() {
		return apiKey;
	}

	public static class Builder {
		private String apiLogin;
		private String apiKey;

		public Builder withApiLogin(String apiLogin) {
			this.apiLogin = apiLogin;
			return this;
		}

		public Builder withApiKey(String apiKey) {
			this.apiKey = apiKey;
			return this;
		}

		public Merchant build() {
			Merchant merchantDto = new Merchant();
			merchantDto.apiLogin = apiLogin;
			merchantDto.apiKey = apiKey;
			return merchantDto;
		}
	}

}
