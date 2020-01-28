package com.catstore.servicestore.dtos.payu;

public class RequestToken extends RequestGeneric{

	private CreditCardToken creditCardToken;

	/**
	 * @return the creditCardToken
	 */
	public CreditCardToken getCreditCardToken() {
		return creditCardToken;
	}

	public static class Builder extends RequestGeneric.BuilderGeneric{
		private CreditCardToken creditCardToken;

		public Builder withCreditCardToken(CreditCardToken creditCardToken) {
			this.creditCardToken = creditCardToken;
			return this;
		}

		public RequestToken build() {
			return new RequestToken(this);
		}
	}
	
	private RequestToken(Builder builder) {
		super(builder);
		this.creditCardToken = builder.creditCardToken;
	}

}
