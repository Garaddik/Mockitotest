package com.mockito.AutomateRestAPIs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mockito.AutomateRestAPIs.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
