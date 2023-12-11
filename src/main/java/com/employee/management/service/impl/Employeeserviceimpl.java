package com.employee.management.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.management.Repository.EmployeeRepository;
import com.employee.management.entity.Employee;
import com.employee.management.service.Employeeservice;



@Service
public class Employeeserviceimpl implements Employeeservice {
   
	private EmployeeRepository repo;
	public Employeeserviceimpl(EmployeeRepository repo) {
		super();
		this.repo=repo;
	}
	@Override
	public List<Employee> getAllEmployees() {
		
		return repo.findAll();
	}
	
	@Override
	public Employee saveEmployee(Employee employee) {
		return repo.save(employee);
	}

	@Override
	public Employee getEmployee(Integer id) {
		return repo.findById(id).get();
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return repo.save(employee);
	}

	@Override
	public void deleteEmployeeById(Integer id) {
		repo.deleteById(id);	
	}

	
	}

	


