package com.example.employeedomainservice.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.employeedomainservice.model.EmployeePersonalDetails;

@Repository
public interface EmployeeRepo extends CrudRepository<EmployeePersonalDetails,Long>{

	//@Query
	
}
