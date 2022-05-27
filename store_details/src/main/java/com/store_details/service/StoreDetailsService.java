package com.store_details.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store_details.entity.Store;
import com.store_details.repository.StoreDetailRepository;

@Service
public class StoreDetailsService {
	@Autowired
	private StoreDetailRepository repo;

	public Store saveStoreDetails(Store store) {
		return repo.save(store);
	}

}
