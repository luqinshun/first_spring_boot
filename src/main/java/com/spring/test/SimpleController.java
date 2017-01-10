package com.spring.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class SimpleController {	

	public static void main(String[] args) {
		SpringApplication.run(SimpleController.class, args);
		
	}
	

}
