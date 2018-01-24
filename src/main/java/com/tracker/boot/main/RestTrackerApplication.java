package com.tracker.boot.main;
/**
 * Prem
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.tracker"})
public class RestTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestTrackerApplication.class, args);
	}
}
