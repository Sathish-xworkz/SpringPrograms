package com.sathish.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//@Component
@Configuration
@ComponentScan("com.sathish.annotations")
public class JavaConfig {

	public JavaConfig() {
		// TODO Auto-generated constructor stub
	System.out.println("java config obj..");
	}
//	
//	@Bean
//	public Products getproProducts() {
//		return new Products();
//	}
	
}
