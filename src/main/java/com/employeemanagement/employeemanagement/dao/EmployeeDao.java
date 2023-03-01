package com.employeemanagement.employeemanagement.dao;

import java.util.List;

import com.employeemanagement.employeemanagement.model.Employee;

public interface EmployeeDao {

	List<Employee> getAllEmployees();

	void saveEmployee(Employee employee);

}
