package com.example.athlze;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class AthlzeApplication {

	public static void main(String[] args) {
		SpringApplication.run(AthlzeApplication.class, args);
	}

}