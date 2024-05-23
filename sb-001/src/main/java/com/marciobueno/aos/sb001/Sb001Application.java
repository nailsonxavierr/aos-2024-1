package com.marciobueno.aos.sb001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Sb001Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Sb001Application.class, args);
		EmployeeService service = context.getBean(EmployeeService.class);
		service.doDemo();
	}

}
