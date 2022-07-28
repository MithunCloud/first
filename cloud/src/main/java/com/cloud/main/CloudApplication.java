package com.cloud.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "com.cloud.controller", "com.cloud.service","com.cloud.dao" })
@EntityScan("com.cloud.model")

public class CloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudApplication.class, args); 
		System.out.println("ssysysy");
	}
}