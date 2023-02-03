package com.coforge.api;

import com.coforge.api.exception.EmployeeServiceExceptionHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class CoforgeApiEmployeesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoforgeApiEmployeesApplication.class, args);
		EmployeeServiceExceptionHandler employeeServiceExceptionHandler = new EmployeeServiceExceptionHandler();
		System.out.println(employeeServiceExceptionHandler);
	}

}
