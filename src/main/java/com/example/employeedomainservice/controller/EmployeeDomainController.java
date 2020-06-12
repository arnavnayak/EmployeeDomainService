package com.example.employeedomainservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeedomainservice.aggregator.EmployeeDomainAggregator;
import com.example.employeedomainservice.model.EmployeeDetailViewRequest;
import com.example.employeedomainservice.model.EmployeePersonalDetails;

@RestController
public class EmployeeDomainController {

	@Autowired
	EmployeeDomainAggregator employeeDomainAggregator;
	
	
	//@RequestMapping(value = "/employee/domain/details/save", method = RequestMethod.GET)
	@PostMapping(value="/employee/domain/details/save",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<EmployeePersonalDetails> saveEmployeeData(@RequestBody EmployeeDetailViewRequest employeeDetailViewRequest){
		return new ResponseEntity<EmployeePersonalDetails>(employeeDomainAggregator.saveEmployeeDetails(employeeDetailViewRequest),HttpStatus.OK);
	}
	
}
