package com.employee.management.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.management.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
