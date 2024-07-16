package com.mysales.offer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Offer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int offerId;
	private String custId;
	private String car;
	private long price;
}
