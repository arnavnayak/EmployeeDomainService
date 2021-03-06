package com.example.employeedomainservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="EmployeePersonalDetails")
@Data
public class EmployeePersonalDetails {

	@Id
	@Column(name="empId")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long empId;
	
	@Column(name="employeeName")
	private String employeeName;
	
	@Column(name="address")
	private String address;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="email")
	private String email;
}
