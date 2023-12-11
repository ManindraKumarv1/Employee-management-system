package com.employee.management.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.employee.management.entity.Employee;

public interface Employeeservice {
      List<Employee> getAllEmployees();
      
      Employee saveEmployee(Employee employee);
  	
  	Employee getEmployee(Integer id);
  	
  	Employee updateEmployee(Employee employee);
  	
  	void deleteEmployeeById(Integer id);
}
