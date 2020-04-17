package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsApplication.class, args);
		System.out.println("***************************************************");
		System.out.println("Hello from Spring boot app for Jenkins testing !!!");
		System.out.println("***************************************************");
		
		
	}

}
