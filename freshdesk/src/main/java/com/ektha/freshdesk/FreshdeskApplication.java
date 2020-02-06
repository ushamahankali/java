package com.ektha.freshdesk;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FreshdeskApplication {

	private static final Logger logger = LogManager.getLogger(FreshdeskApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(FreshdeskApplication.class, args);

		logger.info("Info level log message");
		logger.debug("Debug level log message");
		logger.error("Error level log message");
	}

}
