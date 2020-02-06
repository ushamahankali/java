package com.ektha.freshdeskorm;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@SpringBootApplication
//@PropertySource("classpath:application.properties")
public class MainSpringBoot extends SpringBootServletInitializer {

	@Autowired
	private DataSource dataSource;

	public static void main(String[] args) {

		SpringApplication.run(MainSpringBoot.class, args);

	}

	@Bean
	public LocalSessionFactoryBean sessionFactory() {

		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();

		sessionFactory.setDataSource(dataSource);
		sessionFactory.setPackagesToScan("com.ektha.freshdeskorm");

		Properties hibernateProperties = new Properties();

		hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
		hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		sessionFactory.setHibernateProperties(hibernateProperties);

		return sessionFactory;
	}

}
