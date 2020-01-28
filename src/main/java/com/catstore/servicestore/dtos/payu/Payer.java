package com.catstore.servicestore.dtos.payu;

public class Payer {

	private String merchantPayerId;

	private String fullName;

	private String emailAddress;

	private String contactPhone;

	private String dniNumber;

	/**
	 * @return the merchantPayerId
	 */
	public String getMerchantPayerId() {
		return merchantPayerId;
	}

	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * @return the contactPhone
	 */
	public String getContactPhone() {
		return contactPhone;
	}

	/**
	 * @return the dniNumber
	 */
	public String getDniNumber() {
		return dniNumber;
	}

	public static class Builder {
		private String merchantPayerId;
		private String fullName;
		private String emailAddress;
		private String contactPhone;
		private String dniNumber;

		public Builder withMerchantPayerId(String merchantPayerId) {
			this.merchantPayerId = merchantPayerId;
			return this;
		}

		public Builder withFullName(String fullName) {
			this.fullName = fullName;
			return this;
		}

		public Builder withEmailAddress(String emailAddress) {
			this.emailAddress = emailAddress;
			return this;
		}

		public Builder withContactPhone(String contactPhone) {
			this.contactPhone = contactPhone;
			return this;
		}

		public Builder withDniNumber(String dniNumber) {
			this.dniNumber = dniNumber;
			return this;
		}

		public Payer build() {
			Payer payerDto = new Payer();
			payerDto.merchantPayerId = merchantPayerId;
			payerDto.fullName = fullName;
			payerDto.emailAddress = emailAddress;
			payerDto.contactPhone = contactPhone;
			payerDto.dniNumber = dniNumber;
			return payerDto;
		}
	}

}
