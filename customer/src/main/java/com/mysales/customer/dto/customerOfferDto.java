package com.mysales.customer.dto;

import com.mysales.customer.model.Customer;

public class customerOfferDto {
	private Customer cust;
	private OfferDto offerDto;
	
	public Customer getCust() {
		return cust;
	}
	public void setCust(Customer cust) {
		this.cust = cust;
	}
	public OfferDto getOfferDto() {
		return offerDto;
	}
	public void setOfferDto(OfferDto offerDto) {
		this.offerDto = offerDto;
	}
	
	
}
