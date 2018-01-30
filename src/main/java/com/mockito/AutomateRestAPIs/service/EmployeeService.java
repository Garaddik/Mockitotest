package com.mockito.AutomateRestAPIs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mockito.AutomateRestAPIs.model.Employee;
import com.mockito.AutomateRestAPIs.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	public Employee saveEmployee(Employee employee) {

		return repository.save(employee);

	}

	public Employee employeeDetails(long id) {
		return repository.findOne(123L);
	}

	public List<Employee> employees() {
		return repository.findAll();
	}
}
