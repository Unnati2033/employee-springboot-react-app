/**
 * 
 */
package com.springboot.employee.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.employee.model.Employee;
import com.springboot.employee.repository.EmployeeRepository;

import lombok.RequiredArgsConstructor;

/**
 * @auther Unnati
 */
@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/api/v1/")
@RequiredArgsConstructor
public class EmployeeController {
	
	
	private final EmployeeRepository employeeRepository;
	
	//get all employees
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployee(){
		return employeeRepository.findAll();
	}
	

}
