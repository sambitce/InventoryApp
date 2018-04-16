package com.ignite.inventory.EventGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EventGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventGatewayApplication.class, args);
	}
}
