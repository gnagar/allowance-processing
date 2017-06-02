package com.aps.repository;

import org.springframework.data.repository.CrudRepository;

import com.aps.domain.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
