package com.ignite.inventory.MYSQL_SERVICE.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ignite.inventory.MYSQL_SERVICE.model.ItemEventLog;
import com.ignite.inventory.MYSQL_SERVICE.model.ItemEventLogRepository;

@RestController
@RequestMapping("/rest/mysql/")
public class MySqlResource {

	@Autowired
	ItemEventLogRepository itemEventLogRepository;
	@PostMapping(value = "/create")
	public ResponseEntity<?> createEvent(@RequestBody ItemEventLog message) {
		
		message.setEventTriggerTs(LocalDateTime.now());
		itemEventLogRepository.save(message);
		return ResponseEntity.ok().build();
	}
	
}
