package com.employeemanagement.employeemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.employeemanagement.employeemanagement.model.Employee;
import com.employeemanagement.employeemanagement.service.EmployeeService;

@Controller
@RequestMapping(value = "/employee-management")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/")
	public String welcomPage(Model model) {
		List<Employee> allEmployees = employeeService.getAllEmployees();
		model.addAttribute("employees",allEmployees);
		return "welcome";
	}
	
	@GetMapping("/all-employees")
	public String getAllEmployees(Model model) {
		
		List<Employee> allEmployees = employeeService.getAllEmployees();
		model.addAttribute("allEmployees",allEmployees);
		return "index";
	}

	@PostMapping("/save-employee")
	public void saveEmployee(@ModelAttribute Employee employee) {
		employeeService.saveEmployee(employee);
	}
}
