package com.mockito.AutomateRestAPIs;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.mockito.AutomateRestAPIs.model.Employee;
import com.mockito.AutomateRestAPIs.repository.EmployeeRepository;
import com.mockito.AutomateRestAPIs.service.EmployeeService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AutomateRestApIsApplicationTests {

	@Autowired
	EmployeeService employeeService;

	@MockBean
	EmployeeRepository repository;

	@Test
	public void dummy() {
		assertTrue(true);
	}

	@Test
	public void employee_save() {

		Employee requestEmployee = new Employee();
		requestEmployee.setName("kiran");

		Employee responseEmployee = new Employee();
		responseEmployee.setName("kiran");

		when(repository.save(requestEmployee)).thenReturn(responseEmployee);

		Employee emp = employeeService.saveEmployee(requestEmployee);

		Assert.assertNotNull(emp);

	}

	@Test
	public void employee_details() {

		Employee responseEmployee = new Employee();
		responseEmployee.setName("kiran");
		responseEmployee.setId(123L);

		when(repository.findOne(123L)).thenReturn(responseEmployee);

		Employee emp = employeeService.employeeDetails(123L);

		Assert.assertNotNull(emp);

	}

	@Test
	public void employee_employess_not_exist() {

		List<Employee> employeeList = new ArrayList<>();

		when(repository.findAll()).thenReturn(employeeList);

		List<Employee> employeeList1 = employeeService.employees();

		Assert.assertNotNull(employeeList1);

	}

	@Test
	public void employee_two_employees() {

		List<Employee> employeeList = new ArrayList<>();

		employeeList.add(new Employee());
		employeeList.add(new Employee());

		when(repository.findAll()).thenReturn(employeeList);

		List<Employee> employeeList1 = employeeService.employees();

		Assert.assertNotNull(employeeList1);
		assertTrue(0 < employeeList.size());
	}
}
