package com.catstore.servicestore.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_customer", schema = "puclic")
public class CustomerEntity {
	
	@Id
	@Column(name = "identification")
	private String identification;
	
	@Column(name = "full_name")
	private String fullName;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "contact_phone")
	private String contactPhone;
	
	@OneToMany(mappedBy = "identificationCustomer", cascade = CascadeType.ALL)
	private List<TokenEntity> tokens;
	
	@OneToMany(mappedBy = "identificationCustomer", cascade = CascadeType.ALL)
	private List<PurchaseEntity> purchases;

	/**
	 * @return the identification
	 */
	public String getIdentification() {
		return identification;
	}

	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @return the contactPhone
	 */
	public String getContactPhone() {
		return contactPhone;
	}

	/**
	 * @return the tokens
	 */
	public List<TokenEntity> getTokens() {
		return tokens;
	}

	/**
	 * @return the purchases
	 */
	public List<PurchaseEntity> getPurchases() {
		return purchases;
	}

	/**
	 * @param identification the identification to set
	 */
	public void setIdentification(String identification) {
		this.identification = identification;
	}

	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @param contactPhone the contactPhone to set
	 */
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	/**
	 * @param tokens the tokens to set
	 */
	public void setTokens(List<TokenEntity> tokens) {
		this.tokens = tokens;
	}

	/**
	 * @param purchases the purchases to set
	 */
	public void setPurchases(List<PurchaseEntity> purchases) {
		this.purchases = purchases;
	}

}
