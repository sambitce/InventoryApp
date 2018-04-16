package com.ignite.inventory.EventGateway.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ignite.inventory.EventGateway.model.ItemEvent;

@RestController
@RequestMapping("/rest/publishevent")
public class GatewayResource {

	@PostMapping(value="/web")
	public ResponseEntity<?> receiveEventJson(@RequestBody ItemEvent message){
		
		
		if(message!= null) {
				
			System.out.println("INside message not null");
				return ResponseEntity.ok().build();
		}
		else
			
			return ResponseEntity.status(500).build();
		
	}
}
