package com.employee.management;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.employee.management.Repository.EmployeeRepository;
import com.employee.management.entity.Employee;

@SpringBootApplication
public class EmployeeManagementApplication  {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementApplication.class, args);
	}


}
