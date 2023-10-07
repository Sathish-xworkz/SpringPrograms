package com.sathish.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
//@Configuration
public class Products {

	@Autowired
	private Car car; // HAS-A 
	
//	// DI 
//	@Autowired
//	public Products(Car car) {
//		super();
//		this.car = car;
//	}


	public Products() {
		// TODO Auto-generated constructor stub
		System.out.println("product object is created...");
	}

//	@Autowired
//	public void setCar(Car car) {
//		this.car = car;
//	}


	@Override
	public String toString() {
		return "Products [car=" + car + "]";
	}
	
	
}
