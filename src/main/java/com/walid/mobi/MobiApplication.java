package com.walid.mobi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
//@EnableAutoConfiguration
//@EntityScan(basePackages = {"com.walid.entities"}) 
public class MobiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobiApplication.class, args);
		
	}
}
