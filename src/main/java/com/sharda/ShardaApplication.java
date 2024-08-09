package com.sharda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableJpaAuditing
@EnableTransactionManagement
@ComponentScan(basePackages = "com.sharda")
@Configuration
@EnableJpaRepositories(basePackages = "com.sharda.repo")
public class ShardaApplication  {
	public static void main(String[] args) {
		


		//hey this is test
		

		SpringApplication.run(ShardaApplication.class, args);
	
	}
}
