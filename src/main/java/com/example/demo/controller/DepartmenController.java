package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Department;
import com.example.demo.service.DepartmentService;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/department")
public class DepartmenController {
	
	@Autowired
	private DepartmentService deptservice;
	
    @PostMapping
	public Department createDepartment(@RequestBody Department department) {
		return deptservice.savedept(department);
	}
    
    @GetMapping("/{id}")
    public Optional<Department> getDepartment(@PathVariable Long id) {
        return deptservice.getDepartment(id);
    }
//    
//    @PutMapping("/{dept_id}")
//    public String updateDepartment(@PathVariable Long dept_id, @RequestBody Department department) {
//        return deptservice.updateDepartment(dept_id,department);
//    }
    
	
}
