package com.example.employeedomainservice.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.employeedomainservice.model.EmployeePersonalDetails;
import com.example.employeedomainservice.repo.EmployeeRepo;

@Service
public class EmployeeDomainService {

	@Autowired
	EmployeeRepo employeeRepo;
	
	public EmployeePersonalDetails saveEmployeeDetailsToDb(EmployeePersonalDetails employeePersonalDetails) {
		EmployeePersonalDetails respose=employeeRepo.save(employeePersonalDetails);
		return respose;
		
	}

}
