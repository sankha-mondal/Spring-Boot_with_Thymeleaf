package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWithThymeleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithThymeleafApplication.class, args);
		System.out.println("Spring-Boot With Thymeleaf Application running on port No 8585...");
		
	}
}
