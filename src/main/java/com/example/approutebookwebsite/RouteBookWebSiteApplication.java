package com.example.approutebookwebsite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages={"com.example.approutebookwebsite.repository"})
@EnableAutoConfiguration(exclude= {DataSourceAutoConfiguration.class})
public class RouteBookWebSiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(RouteBookWebSiteApplication.class, args);
		System.out.println("Spring Boot Started....");
	}

}
