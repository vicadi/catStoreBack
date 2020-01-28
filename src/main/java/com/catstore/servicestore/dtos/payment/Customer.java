package com.catstore.servicestore.dtos.payment;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Customer {

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
		private String fullName;
		private String emailAddress;
		private String contactPhone;
		private String dniNumber;

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

		public Customer build() {
			Customer payerDto = new Customer();
			payerDto.fullName = fullName;
			payerDto.emailAddress = emailAddress;
			payerDto.contactPhone = contactPhone;
			payerDto.dniNumber = dniNumber;
			return payerDto;
		}
	}

}
