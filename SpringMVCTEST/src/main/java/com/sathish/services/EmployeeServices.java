package com.sathish.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathish.model.Employee;
import com.sathish.repository.EmployeeRepository;

@Service
public class EmployeeServices {

	public EmployeeServices() {
		// TODO Auto-generated constructor stub
		System.out.println("EmployeeServices obj is created..");
	}
	@Autowired
	private EmployeeRepository emRepository;
	
	public Employee getEmp() {
		return  emRepository.empDataFromDb();
	}
}
