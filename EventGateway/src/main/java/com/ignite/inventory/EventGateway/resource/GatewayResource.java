package com.ignite.inventory.EventGateway.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ignite.inventory.EventGateway.model.ItemEvent;

@RestController
@RequestMapping("/rest/publishevent")
public class GatewayResource {

	@Autowired
	RestTemplate restTemplate;
	
	@PostMapping(value="/web")
	public ResponseEntity<?> receiveEventJson(@RequestBody ItemEvent message){
		
		
		if(message!= null) {
				
			HttpEntity<ItemEvent> request = new HttpEntity<>(message);
			System.out.println("INside message not null");
			ResponseEntity<?> response = restTemplate.exchange("http://message-processor/rest/kafka/publish" , HttpMethod.POST, request, Integer.class);
				return response.ok().build();
		}
		else
			
			return ResponseEntity.status(500).build();
		
	}
}
