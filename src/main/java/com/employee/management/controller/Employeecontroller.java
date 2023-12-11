package com.employee.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.employee.management.entity.Employee;
import com.employee.management.service.Employeeservice;

@Controller
public class Employeecontroller {
	@Autowired
	private Employeeservice empservice;
	@GetMapping("/employees")
	public String listemployees(Model model) {
		model.addAllAttributes(empservice.getAllEmployees());
		return "employees";
		
	}
	@GetMapping("/employees/new")
	public String createemployeeform(  Model model) {
		
		Employee employee=new Employee();
		model.addAttribute("employee", employee);
		return "create_employee";
	} 
	
	@PostMapping("/employees")
	public String saveStudent(@ModelAttribute("employee") Employee employee) {
		 empservice.saveEmployee(employee);
		return "redirect:/employees";
	}
	
	@GetMapping("/employees/edit/{id}")
	public String editEmployeetForm(@PathVariable Integer id, Model model) {
		model.addAttribute("employee", empservice.getEmployee(id));
		return "edit_employee";
	}

	@PostMapping("/employee/{id}")
	public String updateEmployee(@PathVariable Integer id,
			@ModelAttribute("employee") Employee employee,
			Model model) {
		
		
		Employee existingEmployee = empservice.getEmployee(id);
		existingEmployee.setId(id);
		existingEmployee.setFirstname(employee.getFirstname());
		existingEmployee.setLastname(employee.getLastname());
		existingEmployee.setEmail(employee.getEmail());
		existingEmployee.setRole(employee.getRole());
		existingEmployee.setExperience(employee.getExperience());
		existingEmployee.setPhonenumber(employee.getPhonenumber());
		existingEmployee.setSalary(employee.getSalary());
		
		
		 empservice.updateEmployee(existingEmployee);
		return "redirect:/employees";		
	}
	
	// handler method to handle delete  request
	
	@GetMapping("/employees/{id}")
	public String deleteemployee(@PathVariable Integer id) {
		empservice.deleteEmployeeById(id);
		return "redirect:/employees";
	}	

}
