package com.honey.windy.springbootstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.sql.Timestamp;

@SpringBootApplication
@ComponentScan(basePackages = "com.honey.windy")
public class StartApplication {

	public static void main(String[] args) {
		SpringApplication.run(StartApplication.class, args);



	}
}
