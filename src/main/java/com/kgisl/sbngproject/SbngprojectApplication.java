package com.kgisl.sbngproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@Configuration
public class SbngprojectApplication implements WebMvcConfigurer {

    public static void main(String[] args) {
        SpringApplication.run(SbngprojectApplication.class, args);
    }

    @Bean
    public String baseUrl() {
        String baseUrl = System.getenv("http://localhost:8080");

        if (baseUrl == null) {
            baseUrl = "https://sbwithng.onrender.com/";
        }

        return baseUrl;
    }
}
