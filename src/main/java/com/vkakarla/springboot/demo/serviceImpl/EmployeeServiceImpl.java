package com.vkakarla.springboot.demo.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.vkakarla.springboot.demo.model.Employee;
import com.vkakarla.springboot.demo.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public Employee getEmployeeByEmpId(String empId) {
		
		Employee employee = new Employee();
		employee.setEmpId(empId);
		employee.setFirstName("Veer");
		employee.setLastName("Kakarla");
		employee.setSsn("123-45-6789");

		return employee;

	}

	@Override
	public List<Employee> getAllEmployees() {
		ArrayList<Employee> empList = new ArrayList<>();

		Employee employee = new Employee();
		employee.setEmpId("100");
		employee.setFirstName("Vkakarla");
		employee.setLastName("Kakarla");
		employee.setSsn("123-45-6789");

		Employee employee1 = new Employee();
		employee1.setEmpId("101");
		employee1.setFirstName("Praveen");
		employee1.setLastName("Kakarla");
		employee1.setSsn("123-45-6789");

		Employee employee2 = new Employee();
		employee2.setEmpId("102");
		employee2.setFirstName("Suresh");
		employee2.setLastName("Kakarla");
		employee2.setSsn("123-45-6789");

		empList.add(employee);
		empList.add(employee1);
		empList.add(employee2);

		return empList;
	}

}
