package com.mysales.offer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mysales.offer.model.Offer;

@Repository
public interface OfferRepository extends JpaRepository<Offer, Integer> {

	Offer findByCustId(String CustId);
}
