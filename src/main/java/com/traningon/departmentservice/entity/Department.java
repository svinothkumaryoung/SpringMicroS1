package com.traningon.departmentservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="department")
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long departmentId;
	
	@Column(name="department_name")
	private String departmentName;
	
	@Column(name="department_address")
	private String departmentAddress;
	
	@Column(name="department_code")
	private String departmentCode;
}
