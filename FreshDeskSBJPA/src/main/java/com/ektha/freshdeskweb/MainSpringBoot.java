package com.ektha.freshdeskweb;

import java.net.UnknownHostException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MainSpringBoot extends SpringBootServletInitializer {

	public static void main(String[] args) throws UnknownHostException {

		SpringApplication.run(MainSpringBoot.class, args);
//		 ConfigurableApplicationContext app = 
//		SimpleCommandLinePropertySource source = new SimpleCommandLinePropertySource(args);
//
//		if (!source.containsProperty("spring.profiles.active")
//				&& !System.getenv().containsKey("SPRING_PROFILES_ACTIVE")) {
//
//			app.setEnvironment("Production");
//		}

	}
}
