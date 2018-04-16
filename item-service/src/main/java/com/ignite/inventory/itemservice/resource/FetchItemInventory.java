package com.ignite.inventory.itemservice.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;




@RestController
@RequestMapping("rest/itemService")
public class FetchItemInventory {

	@Autowired
	RestTemplate restTemplate; 
	
	@GetMapping("/{itemNumber}")
	public Integer getItemInvenory(@PathVariable("itemNumber") final Integer itemNumber) {
		
	 System.out.println("INput is " + itemNumber);
		ResponseEntity<Integer> qty = restTemplate.exchange("http://db-service/rest/cassandradb/" + itemNumber, HttpMethod.GET, null, Integer.class);
			System.out.println("Afer DB  service hit ");
		return qty.getBody();
	}
	
}
