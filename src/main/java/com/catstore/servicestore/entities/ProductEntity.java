package com.catstore.servicestore.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_product", schema = "puclic")
public class ProductEntity {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "name_product")
	private String nameProduct;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "stock")
	private int stock;
	
	@Column(name = "value")
	private int value;
	
	@Column(name = "name_image")
	private String nameImage;
	
	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
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
	 * @return the nameProduct
	 */
	public String getNameProduct() {
		return nameProduct;
	}

	/**
	 * @param nameProduct the nameProduct to set
	 */
	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the stock
	 */
	public int getStock() {
		return stock;
	}

	/**
	 * @param stock the stock to set
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}

	/**
	 * @return the nameImage
	 */
	public String getNameImage() {
		return nameImage;
	}

	/**
	 * @param nameImage the nameImage to set
	 */
	public void setNameImage(String nameImage) {
		this.nameImage = nameImage;
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
	
}
