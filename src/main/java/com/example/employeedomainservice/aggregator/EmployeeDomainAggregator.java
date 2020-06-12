package com.example.employeedomainservice.aggregator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.example.employeedomainservice.model.EmployeeDetailViewRequest;
import com.example.employeedomainservice.model.EmployeePersonalDetails;
import com.example.employeedomainservice.service.EmployeeDomainService;

@Component
public class EmployeeDomainAggregator {

	@Autowired
	EmployeeDomainService employeeDomainService;
	
	public EmployeePersonalDetails saveEmployeeDetails(EmployeeDetailViewRequest employeeDetailsFromViewService){
		EmployeePersonalDetails employeePersonalDetails = settingValuesToBeSavedInDB(employeeDetailsFromViewService);
		EmployeePersonalDetails response=employeeDomainService.saveEmployeeDetailsToDb(employeePersonalDetails);
		return response;
		
	}

	private EmployeePersonalDetails settingValuesToBeSavedInDB(
			EmployeeDetailViewRequest employeeDetailsFromViewService) {
		EmployeePersonalDetails employeePersonalDetails=new EmployeePersonalDetails();
		employeePersonalDetails.setEmployeeName(employeeDetailsFromViewService.getEmpName());
		employeePersonalDetails.setEmail(employeeDetailsFromViewService.getEmail());
		//employeePersonalDetails.setExperience(employeeDetailsFromViewService.getExperience());
		employeePersonalDetails.setPhone(employeeDetailsFromViewService.getPhone());
		employeePersonalDetails.setAddress(employeeDetailsFromViewService.getAddress());
		return employeePersonalDetails;
	}
}
