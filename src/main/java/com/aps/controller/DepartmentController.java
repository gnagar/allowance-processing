package com.aps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aps.domain.Department;
import com.aps.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService departmentservice;

	@GetMapping("/department/v1")
	public List<Department> getAllDepartment() {
		return departmentservice.getAllDepartments();
	}

	@PostMapping("/department/v1")
	public void addDepartment(@RequestBody(required = true) Department department) {
		departmentservice.addDepartment(department);
	}

}