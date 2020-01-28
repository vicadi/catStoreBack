package com.catstore.servicestore.dtos.payment;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.catstore.servicestore.anotations.FormatDateConstraint;
import com.catstore.servicestore.anotations.NumberStringConstraint;
import com.catstore.servicestore.enums.TypeCard;

public class CreditCardData {

	@NotNull
	@NotEmpty
	@Size(min = 13, max = 20)
	@NumberStringConstraint
	private String number;

	@NotNull
	@NotEmpty
	@Size(min = 3, max = 4)
	@NumberStringConstraint
	private String securityCode;

	@NotNull
	@FormatDateConstraint
	private String expirationDate;

	@NotNull
	@Size(min = 1, max = 2)
	@NumberStringConstraint
	private String installmentsNumber;

	@NotNull
	private TypeCard typeCard;
	
	@NotNull
	@NotEmpty
	private String nameCard;
	
	@NotNull
	@NotEmpty
	private String identificationCustomer;

	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @return the securityCode
	 */
	public String getSecurityCode() {
		return securityCode;
	}

	/**
	 * @return the expirationDate
	 */
	public String getExpirationDate() {
		return expirationDate;
	}

	/**
	 * @return the installmentsNumber
	 */
	public String getInstallmentsNumber() {
		return installmentsNumber;
	}

	/**
	 * @return the typeCard
	 */
	public TypeCard getTypeCard() {
		return typeCard;
	}

	/**
	 * @return the nameCard
	 */
	public String getNameCard() {
		return nameCard;
	}

	/**
	 * @return the identificationCustomer
	 */
	public String getIdentificationCustomer() {
		return identificationCustomer;
	}

	public static class Builder {
		private String number;
		private String securityCode;
		private String expirationDate;
		private String installmentsNumber;
		private TypeCard typeCard;
		private String nameCard;
		private String identificationCustomer;

		public Builder withNumber(String number) {
			this.number = number;
			return this;
		}

		public Builder withSecurityCode(String securityCode) {
			this.securityCode = securityCode;
			return this;
		}

		public Builder withExpirationDate(String expirationDate) {
			this.expirationDate = expirationDate;
			return this;
		}

		public Builder withInstallmentsNumber(String installmentsNumber) {
			this.installmentsNumber = installmentsNumber;
			return this;
		}

		public Builder withTypeCard(TypeCard typeCard) {
			this.typeCard = typeCard;
			return this;
		}
		
		public Builder withNameCard(String nameCard) {
			this.nameCard = nameCard;
			return this;
		}
		
		public Builder withIdentificationCustomer(String identificationCustomer) {
			this.identificationCustomer = identificationCustomer;
			return this;
		}

		public CreditCardData build() {
			CreditCardData creditCardData = new CreditCardData();
			creditCardData.number = number;
			creditCardData.securityCode = securityCode;
			creditCardData.expirationDate = expirationDate;
			creditCardData.installmentsNumber = installmentsNumber;
			creditCardData.typeCard = typeCard;
			creditCardData.nameCard = nameCard;
			creditCardData.identificationCustomer = identificationCustomer;
			return creditCardData;
		}
	}

}
