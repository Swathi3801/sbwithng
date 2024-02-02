package com.kgisl.sbngproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@Configuration

public class SbngprojectApplication implements WebMvcConfigurer{

	public static void main(String[] args) {
		SpringApplication.run(SbngprojectApplication.class, args);
	}

}
