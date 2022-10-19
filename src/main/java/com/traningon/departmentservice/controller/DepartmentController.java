package com.traningon.departmentservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.traningon.departmentservice.entity.Department;
import com.traningon.departmentservice.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/add")
	public Department saveDepartment(@RequestBody Department department)
	{
		
		return departmentService.saveDepartment(department);
	}
	
	@GetMapping("reterive/{id}")
	public Department findDepartmentById(@PathVariable("id") Long departmentId)
	{
		LOGGER.info("Inside findDepatmentById method odf DepartmentController");
		return departmentService.findDepartmentById(departmentId);
		
	}

}
