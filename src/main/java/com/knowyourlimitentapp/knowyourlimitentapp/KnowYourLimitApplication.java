package com.knowyourlimitentapp.knowyourlimitentapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"com.knowyourlimitentapp", "com.knowyourlimit.dto", "com.knowyourlimitentapp.knowyourlimitentapp", "com.knowyourlimit.service"})
public class KnowYourLimitApplication {

	public static void main(String[] args) {
		SpringApplication.run(KnowYourLimitApplication.class, args);
	}

}
