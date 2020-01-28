package com.catstore.servicestore.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_purchase", schema = "puclic")
public class PurchaseEntity {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "date_creation")
	private Date dateCreation;
	
	@Column(name = "date_modify")
	private Date dateModify;
	
	@Column(name = "transaction_id")
	private String transactionId;
	
	@Column(name = "order_id")
	private String orderId;
	
	@Column(name = "status")
	private String status;
	
	@ManyToOne
	@JoinColumn
	private CustomerEntity identificationCustomer;
	
	@OneToMany(mappedBy = "purchase", cascade = CascadeType.ALL)
	private List<PurchaseDetailEntity> purchaseDetails;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the dateCreation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}

	/**
	 * @param dateCreation the dateCreation to set
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	/**
	 * @return the dateModify
	 */
	public Date getDateModify() {
		return dateModify;
	}

	/**
	 * @param dateModify the dateModify to set
	 */
	public void setDateModify(Date dateModify) {
		this.dateModify = dateModify;
	}

	/**
	 * @return the transactionId
	 */
	public String getTransactionId() {
		return transactionId;
	}

	/**
	 * @param transactionId the transactionId to set
	 */
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	/**
	 * @return the orderId
	 */
	public String getOrderId() {
		return orderId;
	}

	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
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
	 * @return the purchaseDetails
	 */
	public List<PurchaseDetailEntity> getPurchaseDetails() {
		return purchaseDetails;
	}

	/**
	 * @param purchaseDetails the purchaseDetails to set
	 */
	public void setPurchaseDetails(List<PurchaseDetailEntity> purchaseDetails) {
		this.purchaseDetails = purchaseDetails;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

}
