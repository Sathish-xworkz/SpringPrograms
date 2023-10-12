package com.sathish.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.sathish.model.Employee;
import com.sathish.services.EmployeeServices;

//@Component== only for general class 

@Controller
public class EmployeeController {

	EmployeeController(){
		System.out.println("EmployeeController obj is created..");
	}
	@Autowired
	private EmployeeServices employeeServices;

	public Employee empInfo() {
	return employeeServices.getEmp();
	}
}
