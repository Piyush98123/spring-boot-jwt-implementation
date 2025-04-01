package com.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
@EnableWebSecurity
public class JwtImplApplication {


	@GetMapping("/")
	public String welcomeUser(Principal principal){
		return "Hi "+principal.getName()+" welcome";
	}

	public static void main(String[] args) {
		SpringApplication.run(JwtImplApplication.class, args);
	}

}
