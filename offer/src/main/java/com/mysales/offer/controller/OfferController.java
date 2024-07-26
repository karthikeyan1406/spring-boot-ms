package com.mysales.offer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mysales.offer.model.Offer;
import com.mysales.offer.service.OfferService;

@RestController
@RequestMapping("/mysales/v1/offer")
public class OfferController {
	@Autowired
	private OfferService offerSvc;
	
	Logger log=LoggerFactory.getLogger(OfferController.class);
	
	@PostMapping("/createOffer")
	public String createOffer(@RequestBody Offer offer){
		offerSvc.createOffer(offer);
		return "success";
	}
	
	@GetMapping("/getOffer/{offerId}")
	public Offer getOfferById(@PathVariable int offerId) {
		return offerSvc.getOfferById(offerId);
	}
	@GetMapping("/getOfferByCustId/{custId}")
	public Offer getOfferByCustId(@PathVariable String custId) {
		log.info("inside offer service getOfferByCustId:"+custId);
		return offerSvc.getOfferByCustId(custId);
	}
}
