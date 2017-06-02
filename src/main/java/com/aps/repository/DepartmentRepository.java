package com.aps.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aps.domain.Department;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, String> {

}
