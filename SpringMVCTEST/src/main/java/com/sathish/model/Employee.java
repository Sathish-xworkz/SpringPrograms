package com.sathish.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Component
public class Employee {

	private int id;
	private String name;
	private String address;
	
	// need constructor
	// setter/getter
	// tostring 
}
