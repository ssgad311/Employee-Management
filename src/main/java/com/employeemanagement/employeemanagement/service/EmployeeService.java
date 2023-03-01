package com.employeemanagement.employeemanagement.service;

import java.util.List;

import com.employeemanagement.employeemanagement.model.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployees();

	void saveEmployee(Employee employee);

}
