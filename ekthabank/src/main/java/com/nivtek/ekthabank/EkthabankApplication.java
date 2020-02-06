package com.nivtek.ekthabank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class EkthabankApplication /* extends SpringBootServletInitializer */ {

	// Using a root package also allows the @ComponentScan annotation to be used
	// without needing to specify a basePackage attribute

	public static void main(String[] args) {
		SpringApplication.run(EkthabankApplication.class, args);
	}

	/*
	 * @Override protected SpringApplicationBuilder
	 * configure(SpringApplicationBuilder application) { return
	 * application.sources(EkthabankApplication.class); }
	 */
}
