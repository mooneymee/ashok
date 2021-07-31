package com.example.demo;

import java.util.ArrayList;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class EmployeeProfileServiceImpl implements EmployeeProfileService{
	
	@Autowired
	ProfileRepository repository;
	List<EmployeeProfile> employeeProfileList = new ArrayList<>();
	

	@Override
	public void addEmployee(EmployeeProfile profile) {
		// TODO Auto-generated method stub
		repository.save(profile);
		
	}

	@Override
	public List<EmployeeProfile> getEmployeeProfiles() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
	
	

}
