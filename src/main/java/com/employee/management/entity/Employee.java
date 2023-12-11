package com.employee.management.entity;

import org.hibernate.validator.constraints.Range;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Employees")
@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class Employee {


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
 private Integer id;
@Column(name="first_name")
 private String firstname;
@Column(name="last_name")
 private String lastname;


 private String email;
//@Column(name="role",nullable = false)
 private String role;
 private String experience;
 private String phonenumber;
 private String salary;
 

 public Employee(String firstname, String lastname, String email, String role, String experience, String phonenumber,
		String salary) {
	super();
	this.firstname = firstname;
	this.lastname = lastname;
	this.email = email;
	this.role = role;
	this.experience = experience;
	this.phonenumber = phonenumber;
	this.salary = salary;
}
 
 public Employee() {
	 
 }

 
 

 

}
