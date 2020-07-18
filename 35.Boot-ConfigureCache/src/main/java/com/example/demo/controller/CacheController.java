package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

@RestController
public class CacheController {

	@RequestMapping("/get-cust-info")
	@Cacheable(value="cacheCustInfo")
	public List customerInformation() {
		
		System.out.println("I am from customerInformation");
		
		// DataBase Logic
		List custDetails =  Arrays.asList(
					
				 new Customer(100,"Bank Of America","USA"),
				 new Customer(101,"Bank Of India","India")
		    );
		    
		return custDetails;
	}
	
	@RequestMapping("/clearCache")
	@CacheEvict(value = "cacheCustInfo", allEntries=true) // @CacheEvict will clear the cache when delete any customer info from the database.
    public void removeEmployee(Id customerId) {
    
		System.err.println("Cache Cleared");
        //Database logic will go here to remove the particular customer from the DB.

    }

	
}
