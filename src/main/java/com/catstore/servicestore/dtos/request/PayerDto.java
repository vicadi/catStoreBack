package com.catstore.servicestore.dtos.request;

import javax.validation.constraints.NotEmpty;

import com.sun.istack.NotNull;

public class PayerDto {

	private String merchantPayerId;

	@NotNull
	@NotEmpty
	private String fullName;

	@NotNull
	@NotEmpty
	private String emailAddress;

	@NotNull
	@NotEmpty
	private String contactPhone;

	@NotNull
	@NotEmpty
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

		public Builder merchantPayerId(String merchantPayerId) {
			this.merchantPayerId = merchantPayerId;
			return this;
		}

		public Builder fullName(String fullName) {
			this.fullName = fullName;
			return this;
		}

		public Builder emailAddress(String emailAddress) {
			this.emailAddress = emailAddress;
			return this;
		}

		public Builder contactPhone(String contactPhone) {
			this.contactPhone = contactPhone;
			return this;
		}

		public Builder dniNumber(String dniNumber) {
			this.dniNumber = dniNumber;
			return this;
		}

		public PayerDto build() {
			PayerDto payerDto = new PayerDto();
			payerDto.merchantPayerId = merchantPayerId;
			payerDto.fullName = fullName;
			payerDto.emailAddress = emailAddress;
			payerDto.contactPhone = contactPhone;
			payerDto.dniNumber = dniNumber;
			return payerDto;
		}
	}

}
