package com.vkakarla.springboot.rest.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.vkakarla.springboot.rest.demo.model.Employee;
import com.vkakarla.springboot.rest.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/employee/{empId}")
	public ResponseEntity<Object> getEmployee(@PathVariable String empId) throws Exception {

		Employee employeeResponse = employeeService.getEmployeeByEmpId(empId);

		return new ResponseEntity<Object>(employeeResponse, HttpStatus.OK);
	}

	@GetMapping("/employees")
	public ResponseEntity<Object> getAllEmployees() throws Exception {
		
		 List<Employee> empResponse = employeeService.getAllEmployees();

		return new ResponseEntity<Object>(empResponse, HttpStatus.OK);
	}

}
