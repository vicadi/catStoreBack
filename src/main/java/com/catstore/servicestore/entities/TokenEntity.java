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
	
}
