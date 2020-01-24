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
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email")
	private String email;
	
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
	 * @param identification the identification to set
	 */
	public void setIdentification(String identification) {
		this.identification = identification;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the tokens
	 */
	public List<TokenEntity> getTokens() {
		return tokens;
	}

	/**
	 * @param tokens the tokens to set
	 */
	public void setTokens(List<TokenEntity> tokens) {
		this.tokens = tokens;
	}

	/**
	 * @return the purchases
	 */
	public List<PurchaseEntity> getPurchases() {
		return purchases;
	}

	/**
	 * @param purchases the purchases to set
	 */
	public void setPurchases(List<PurchaseEntity> purchases) {
		this.purchases = purchases;
	}

}
