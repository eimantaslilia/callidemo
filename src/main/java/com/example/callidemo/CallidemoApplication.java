package com.example.callidemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
@EnableJpaAuditing
public class CallidemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CallidemoApplication.class, args);
	}

}
