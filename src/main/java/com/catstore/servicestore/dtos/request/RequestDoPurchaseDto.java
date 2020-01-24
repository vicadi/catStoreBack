package com.catstore.servicestore.dtos.request;

import javax.validation.Valid;

import com.sun.istack.NotNull;

public class RequestDoPurchaseDto {

	@NotNull
	private Boolean tokenizedCreditCard;

	@Valid
	private TransactionDto transaction;

	/**
	 * @return the tokenizedCreditCard
	 */
	public Boolean getTokenizedCreditCard() {
		return tokenizedCreditCard;
	}

	/**
	 * @return the transaction
	 */
	public TransactionDto getTransaction() {
		return transaction;
	}

	public static class Builder {
		private Boolean tokenizedCreditCard;
		private TransactionDto transaction;

		public Builder tokenizedCreditCard(Boolean tokenizedCreditCard) {
			this.tokenizedCreditCard = tokenizedCreditCard;
			return this;
		}

		public Builder transaction(TransactionDto transaction) {
			this.transaction = transaction;
			return this;
		}

		public RequestDoPurchaseDto build() {
			RequestDoPurchaseDto requestDoPurchaseDto = new RequestDoPurchaseDto();
			requestDoPurchaseDto.tokenizedCreditCard = tokenizedCreditCard;
			requestDoPurchaseDto.transaction = transaction;
			return requestDoPurchaseDto;
		}
	}

}
