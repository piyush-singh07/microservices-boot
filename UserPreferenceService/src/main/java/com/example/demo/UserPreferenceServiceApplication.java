package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableEurekaClient
@EnableJpaRepositories("com.example.demo.repositories")
public class UserPreferenceServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserPreferenceServiceApplication.class, args);
	}

}
