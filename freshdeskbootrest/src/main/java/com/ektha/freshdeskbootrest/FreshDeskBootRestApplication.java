package com.ektha.freshdeskbootrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class FreshDeskBootRestApplication extends SpringBootServletInitializer{

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(FreshDeskBootRestApplication.class);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(FreshDeskBootRestApplication.class, args);
	}

}
