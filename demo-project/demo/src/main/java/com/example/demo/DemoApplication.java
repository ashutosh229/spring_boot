package com.example.demo;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(DemoApplication.class);
		springApplication.setAdditionalProfiles("dev");
		ApplicationContext container = SpringApplication.run()
	}

}
