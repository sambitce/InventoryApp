package com.ignite.inventory.MessageProcessor.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.ignite.inventory.MessageProcessor.model.ItemEventLog;

@Service
@EnableKafka
public class KafkaProducerService {

	/*
		@Autowired
		KafkaTemplate<String, ItemEventLog> kafkaTemplate;

		String kafkaTopic = "ItemEventTopic";

		public void send(ItemEventLog message) {
			message.setEventTriggerTs(LocalDateTime.now());
			kafkaTemplate.send(kafkaTopic, message);

		}
*/
	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;

	String kafkaTopic = "itemtopic";

	public void send(String message) {
		//message.setEventTriggerTs(LocalDateTime.now());
		kafkaTemplate.send(kafkaTopic, message);

	}
	
	}

