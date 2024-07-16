package com.mysales.customer.dto;

import lombok.Data;

@Data
public class OfferDto {

	private int offerId;
	private String custId;
	private String car;
	private long price;
}
