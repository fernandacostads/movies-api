package com.lead.dell.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import com.lead.dell.movies.repository.UserRepository;

@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration
@EnableWebSecurity
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class MoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}

}