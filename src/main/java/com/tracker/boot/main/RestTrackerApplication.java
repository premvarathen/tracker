package com.tracker.boot.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.tracker.*") 
public class RestTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestTrackerApplication.class, args);
	}
}
