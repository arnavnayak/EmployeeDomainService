package com.example.employeedomainservice.model;

import lombok.Data;

@Data
public class EmployeeDetailViewRequest {

	private String empName;
	private String address;
	private String email;
	private String phone;
	private float experience;
	
}
