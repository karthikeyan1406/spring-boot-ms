package com.mysales.offer.service;



import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.mysales.offer.model.Offer;
import com.mysales.offer.repository.OfferRepository;

@Service
public class OfferService {
	@Autowired
	OfferRepository offerRepo;
	
	public String createOffer(Offer offer) {
		offerRepo.save(offer);
		return "success";
	}
	
	public Offer getOfferById(int offerId) {
		return offerRepo.findById(offerId).orElseThrow(()-> new NoSuchElementException());
	}

	public Offer getOfferByCustId(String custId) {
		// TODO Auto-generated method stub
		return offerRepo.findByCustId(custId);
	}
}
