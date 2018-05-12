package com.ignite.inventory.MessageProcessor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.ignite.inventory.MessageProcessor.model.ItemEventLog;
import com.ignite.inventory.MessageProcessor.service.KafkaProducerService;

@RestController
@RequestMapping("/rest/kafka/publish")
public class KafkaRestController {

	@Autowired
	KafkaProducerService kafkaProducer ;
	@Autowired
	RestTemplate restTemplate; 
	
	/*
	@PostMapping
	public ResponseEntity<?> publishIntoTopic(@RequestBody ItemEventLog message){
		
		
		kafkaProducer.send(message);
		String url = "http://mysql-service/rest/mysql/create" ;
				ResponseEntity<?> output = restTemplate.postForObject(url, message, ResponseEntity.class);
		return output.ok().build();
	}
	*/
	
	@PostMapping
	public ResponseEntity<?> publishIntoTopic(@RequestBody String message){
		
		System.out.println("Message from service is " + message);
		kafkaProducer.send(message);
		Gson gson = new Gson();
		ItemEventLog itemEventLog = gson.fromJson(message, ItemEventLog.class);
		String url = "http://mysql-service/rest/mysql/create" ;
				ResponseEntity<?> output = restTemplate.postForObject(url, itemEventLog, ResponseEntity.class);
		return output.ok().build();
	}
	
}
