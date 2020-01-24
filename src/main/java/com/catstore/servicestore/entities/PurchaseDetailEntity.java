package com.catstore.servicestore.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_purchase_detail", schema = "puclic")
public class PurchaseDetailEntity {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "amount")
	private int amount;
	
	@Column(name = "quantify")
	private int quantify;
	
	@ManyToOne
	@JoinColumn
	private PurchaseEntity purchase;
	
	@ManyToOne
	@JoinColumn
	private ProductEntity product;

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
	 * @return the amount
	 */
	public int getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}

	/**
	 * @return the quantify
	 */
	public int getQuantify() {
		return quantify;
	}

	/**
	 * @param quantify the quantify to set
	 */
	public void setQuantify(int quantify) {
		this.quantify = quantify;
	}

	/**
	 * @return the purchase
	 */
	public PurchaseEntity getPurchase() {
		return purchase;
	}

	/**
	 * @param purchase the purchase to set
	 */
	public void setPurchase(PurchaseEntity purchase) {
		this.purchase = purchase;
	}

	/**
	 * @return the product
	 */
	public ProductEntity getProduct() {
		return product;
	}

	/**
	 * @param product the product to set
	 */
	public void setProduct(ProductEntity product) {
		this.product = product;
	}

}
