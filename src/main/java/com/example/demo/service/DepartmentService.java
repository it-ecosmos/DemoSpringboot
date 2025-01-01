package com.example.demo.service;

import java.util.Optional;

import com.example.demo.dto.Department;

public interface DepartmentService {

	Department savedept(Department department);

	Optional<Department> getDepartment(Long id);

//	String updateDepartment(Long dept_id, Department department);

}
