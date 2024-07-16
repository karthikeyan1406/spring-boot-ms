package com.mysales.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mysales.customer.dto.OfferDto;
import com.mysales.customer.dto.customerOfferDto;
import com.mysales.customer.model.Customer;
import com.mysales.customer.service.CustomerService;

@RestController
@RequestMapping("/mysales/v1")
public class CustomerController {
	@Autowired
	CustomerService custService;
	
	@PostMapping("/customer/save")
	public ResponseEntity<String> saveCustomer(@RequestBody Customer cust){
		custService.saveCustomer(cust);
		return new ResponseEntity<String>("success",HttpStatus.CREATED);
	}
	
	@GetMapping("/customer/{custId}")
	public ResponseEntity<Customer> getCustomer(@PathVariable String custId){
		Customer cust=custService.getCustomerById(custId);
		return new ResponseEntity<Customer>(cust,HttpStatus.FOUND);
	}
	@GetMapping("/offerForCustomer/{custId}")
	public ResponseEntity<customerOfferDto> getOfferForCustomer(@PathVariable String custId){
		customerOfferDto co=custService.getOfferUsingCustId(custId);
		return new ResponseEntity<customerOfferDto>(co,HttpStatus.FOUND);
	}
}
