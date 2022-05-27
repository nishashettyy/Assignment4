package com.store_locator.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store_locator.entity.Store;

public interface StoreLocatorRepository extends JpaRepository<Store, String>{

	
}
