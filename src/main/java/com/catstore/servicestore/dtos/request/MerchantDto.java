package com.catstore.servicestore.dtos.request;

public class MerchantDto {

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

		public Builder apiLogin(String apiLogin) {
			this.apiLogin = apiLogin;
			return this;
		}

		public Builder apiKey(String apiKey) {
			this.apiKey = apiKey;
			return this;
		}

		public MerchantDto build() {
			MerchantDto merchantDto = new MerchantDto();
			merchantDto.apiLogin = apiLogin;
			merchantDto.apiKey = apiKey;
			return merchantDto;
		}
	}

}
