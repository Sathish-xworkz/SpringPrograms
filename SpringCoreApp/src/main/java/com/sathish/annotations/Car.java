package com.sathish.annotations;

import org.springframework.stereotype.Component;

@Component
public class Car {

	String model="TATA";
	public Car() {
		// TODO Auto-generated constructor stub
	System.out.println("car object is created...");
	}

	@Override
	public String toString() {
		return "Car [model=" + model + "]";
	}
	
	
}
