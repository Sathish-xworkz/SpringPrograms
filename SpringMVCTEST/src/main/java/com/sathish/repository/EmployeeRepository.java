package com.sathish.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sathish.model.Employee;

@Repository
public class EmployeeRepository {

	EmployeeRepository(){
		System.out.println("EmployeeRepository obj is created..");
	}
	@Autowired
	private Employee emp;
	
	public Employee empDataFromDb() {
		
		//Employee emp=new Employee();
		emp.setId(100);
		emp.setName("sathish");
		emp.setAddress("Hassan");
		return emp;
		
	}
}
