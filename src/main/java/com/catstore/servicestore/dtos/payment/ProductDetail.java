package com.catstore.servicestore.dtos.payment;

import javax.validation.constraints.NotNull;

public class ProductDetail {

	@NotNull
	private Integer productId;

	private Integer purchaseId;

	@NotNull
	private Integer quantify;

	@NotNull
	private Integer amount;

	/**
	 * @return the productId
	 */
	public Integer getProductId() {
		return productId;
	}

	/**
	 * @return the purchaseId
	 */
	public Integer getPurchaseId() {
		return purchaseId;
	}

	/**
	 * @return the quantify
	 */
	public Integer getQuantify() {
		return quantify;
	}

	/**
	 * @return the amount
	 */
	public Integer getAmount() {
		return amount;
	}

	public static class Builder {
		private Integer productId;
		private Integer purchaseId;
		private Integer quantify;
		private Integer amount;

		public Builder productId(Integer productId) {
			this.productId = productId;
			return this;
		}

		public Builder purchaseId(Integer purchaseId) {
			this.purchaseId = purchaseId;
			return this;
		}

		public Builder quantify(Integer quantify) {
			this.quantify = quantify;
			return this;
		}

		public Builder amount(Integer amount) {
			this.amount = amount;
			return this;
		}

		public ProductDetail build() {
			ProductDetail productDetailDto = new ProductDetail();
			productDetailDto.productId = productId;
			productDetailDto.purchaseId = purchaseId;
			productDetailDto.quantify = quantify;
			productDetailDto.amount = amount;
			return productDetailDto;
		}
	}

}
