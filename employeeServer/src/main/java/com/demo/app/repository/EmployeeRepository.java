package com.demo.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.app.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{
	void deleteEmployeeById(Long id);

	Optional<Employee> findEmployeeById(Long id);

}
