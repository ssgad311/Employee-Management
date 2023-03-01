package com.employeemanagement.employeemanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeemanagement.employeemanagement.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
