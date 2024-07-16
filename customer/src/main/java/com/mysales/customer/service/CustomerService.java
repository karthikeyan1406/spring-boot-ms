package com.mysales.customer.service;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysales.customer.config.OfferClientConfig;
import com.mysales.customer.dto.OfferDto;
import com.mysales.customer.dto.customerOfferDto;
import com.mysales.customer.model.Customer;
import com.mysales.customer.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository custRepo;
	@Autowired
	private OfferClientConfig offerClient;
	
	public String saveCustomer(Customer cust) {
		custRepo.save(cust);
		return "successfully saved";
	}
	
	public Customer getCustomerById(String custId) {
		return custRepo.findById(custId).orElseThrow(()-> new NoSuchElementException());
	}
	public customerOfferDto getOfferUsingCustId(String custId) {
		OfferDto offer= offerClient.getOfferByCustId(custId);
		Customer cust= custRepo.findById(custId).get();
		customerOfferDto co=new customerOfferDto();
		co.setCust(cust);
		co.setOfferDto(offer);
		return co;
	}

}
