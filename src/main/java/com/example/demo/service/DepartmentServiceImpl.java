package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.Department;
import com.example.demo.repo.DepartmentRepo;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	
	@Autowired
	private DepartmentRepo departmentRepo;

	@Override
	public Department savedept(Department department) {
		Department dept=departmentRepo.save(department);
		return dept;
	}

	@Override
	public Optional<Department> getDepartment(Long id) {
		return departmentRepo.findById(id);
	}

	

}
