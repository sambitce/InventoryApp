package com.ignite.inventory.MessageProcessor.config;



import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import com.ignite.inventory.MessageProcessor.model.ItemEventLog;



@Configuration
@EnableKafka
public class KafkaProducerConfig {

	//@Value("${spring.kafka.bootstrap-servers}")
	//private String bootstrapServer ;
	@Bean
	//public ProducerFactory<String,ItemEventLog>producerFactory(){
	public ProducerFactory<String,String>producerFactory(){
		
		return new DefaultKafkaProducerFactory<>(produerConfigs());
	}
	
	@Bean
	public Map<String,Object> produerConfigs(){
		
		Map<String,Object> props = new HashMap<>() ;
		
		props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,"192.168.99.100:9092" );
		props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);

		/*props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);*/
		props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		return props;
	}
	
	/*
	@Bean
	public KafkaTemplate<String,ItemEventLog> kafkaTempalte(){
		
		return new KafkaTemplate<String,ItemEventLog>(producerFactory());
	}
	*/
	
	@Bean
	public KafkaTemplate<String,String> kafkaTempalte(){
		
		return new KafkaTemplate<String,String>(producerFactory());
	}
}

