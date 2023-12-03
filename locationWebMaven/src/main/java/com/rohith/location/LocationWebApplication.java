package com.rohith.location;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.rohith.location.controllers,"+"com.rohith.location.services,"+"com.rohith.location.entities")
public class LocationWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(LocationWebApplication.class, args);
	}

}
