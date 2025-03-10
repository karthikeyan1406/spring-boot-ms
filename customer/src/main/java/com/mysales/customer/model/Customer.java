package com.mysales.customer.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Data
public class Customer {
	@Id
	private String custId;
	private String custName;
	@Temporal(value = TemporalType.DATE)
	private Date createdOn;
}
