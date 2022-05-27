package com.store_details.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.store_details.entity.Store;
import com.store_details.service.StoreDetailsService;

@RestController
public class StoreDetailsController {
	@Autowired
	private StoreDetailsService service;
	
	@PostMapping("/storeDetails")
	public Store saveStoreDetails(@Valid @RequestBody Store store) {
		return service.saveStoreDetails(store);
	}
	
	

}
