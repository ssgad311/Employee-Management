package com.employeemanagement.employeemanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeemanagement.employeemanagement.dao.EmployeeDao;
import com.employeemanagement.employeemanagement.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDao employeeDao;
	
	public List<Employee> getAllEmployees() {
		return employeeDao.getAllEmployees();
	}

	public void saveEmployee(Employee employee) {
		employeeDao.saveEmployee(employee);	
	}

	
}
