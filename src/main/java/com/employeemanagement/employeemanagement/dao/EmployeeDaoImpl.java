package com.employeemanagement.employeemanagement.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employeemanagement.employeemanagement.model.Employee;
import com.employeemanagement.employeemanagement.repo.EmployeeRepository;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll(); 	
	}

	public void saveEmployee(Employee employee) {
		if(employee.getId()==null) {
			employeeRepository.save(employee);
		}else {
			Employee employeeObject = employeeRepository.findById(employee.getId()).get();
			employeeObject.setName(employee.getName());
			employeeObject.setAddress(employee.getAddress());
			employeeObject.setEmailId(employee.getEmailId());
			employeeObject.setGender(employee.getGender());
		}
	}

	
}
