package com.example.employeedomainservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.example.employeedomainservice")
public class EmployeedomainserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeedomainserviceApplication.class, args);
	}
}
