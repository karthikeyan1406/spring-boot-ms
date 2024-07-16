package com.mysales.customer.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.mysales.customer.dto.OfferDto;


@FeignClient(name = "offer-service",url = "http://localhost:8002/mysales/v1",
configuration = offerFeignClientConfig.class)
public interface OfferClientConfig {
	
	@GetMapping("/getOfferByCustId/{custId}")
	public OfferDto getOfferByCustId(@PathVariable String custId);
}
