package com.kgisl.sbngproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@Configuration

public class SbngprojectApplication implements WebMvcConfigurer{
	String baseUrl = System.getenv("https://sbwithng.onrender.com/");
    if (baseUrl == null) {
      baseUrl = "http://localhost:8080"; // use localhost as default
    }

	public static void main(String[] args) {
		SpringApplication.run(SbngprojectApplication.class, args);
	}

}
