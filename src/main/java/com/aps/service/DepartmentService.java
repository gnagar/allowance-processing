package com.aps.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aps.domain.Department;
import com.aps.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	DepartmentRepository departmentrepository;

	public List<Department> getAllDepartments() {
		List<Department> dept = new ArrayList<>();
		departmentrepository.findAll().forEach(dept::add);
		return dept;
	}

	public void addDepartment(Department department) {
		department.setDepartmentId(null);
		departmentrepository.save(department);
	}
}
