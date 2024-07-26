package com.mysales.customer.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.mysales.customer.dto.OfferDto;


@FeignClient(name = "offer-service",
configuration = offerFeignClientConfig.class)
public interface OfferClientConfig {
	
	@GetMapping("/mysales/v1/offer/getOfferByCustId/{custId}")
	public OfferDto getOfferByCustId(@PathVariable String custId);
}
