package com.example.employeedomainservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="EmployeeProfessionalDetails")
@Data
public class EmployeeProfessionalDetails {

	@Id
	@Column(name="empId")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long empId;
	
	@Column(name="employeerole")
	private String employeeRole;
	
	@Column(name="experience")
	private float experience;
	
	@Column(name="projectName")
	private String projectName;
	
	
}
