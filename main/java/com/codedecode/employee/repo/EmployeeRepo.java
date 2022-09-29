package com.codedecode.employee.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codedecode.employee.entities.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{
	
	

}
