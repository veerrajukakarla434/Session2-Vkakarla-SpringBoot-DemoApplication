package com.vkakarla.springboot.rest.demo.service;

import java.util.List;

import com.vkakarla.springboot.rest.demo.model.Employee;

public interface EmployeeService {
    
	 public Employee getEmployeeByEmpId(String empId);
	 
	 public List<Employee> getAllEmployees();
	 
}
