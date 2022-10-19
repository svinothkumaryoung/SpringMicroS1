package com.traningon.departmentservice.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.traningon.departmentservice.entity.Department;
import com.traningon.departmentservice.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
public class DepartmentService {
	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	public Department saveDepartment(Department department) 
	{
		
		return departmentRepository.save(department);
	}

	public Department findDepartmentById(Long departmentId) {
		LOGGER.info("Inside findDepartment method of DepartmentService");
		return  departmentRepository.findByDepartmentId(departmentId);
	} 

}
