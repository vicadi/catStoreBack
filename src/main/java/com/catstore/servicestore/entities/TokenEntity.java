package com.catstore.servicestore.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_token", schema = "puclic")
public class TokenEntity {

	@Id
	@Column(name = "token")
	private String token;
	
	@ManyToOne
	@JoinColumn
	private CustomerEntity identificationCustomer;
	
	@Column(name = "last_four_number")
	private String lastFourNumber;
	
	@Column(name = "franchise")
	private String franchise;

	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * @param token the token to set
	 */
	public void setToken(String token) {
		this.token = token;
	}

	/**
	 * @return the identificationCustomer
	 */
	public CustomerEntity getIdentificationCustomer() {
		return identificationCustomer;
	}

	/**
	 * @param identificationCustomer the identificationCustomer to set
	 */
	public void setIdentificationCustomer(CustomerEntity identificationCustomer) {
		this.identificationCustomer = identificationCustomer;
	}

	/**
	 * @return the lastFourNumber
	 */
	public String getLastFourNumber() {
		return lastFourNumber;
	}

	/**
	 * @param lastFourNumber the lastFourNumber to set
	 */
	public void setLastFourNumber(String lastFourNumber) {
		this.lastFourNumber = lastFourNumber;
	}

	/**
	 * @return the franchise
	 */
	public String getFranchise() {
		return franchise;
	}

	/**
	 * @param franchise the franchise to set
	 */
	public void setFranchise(String franchise) {
		this.franchise = franchise;
	}
	
}
