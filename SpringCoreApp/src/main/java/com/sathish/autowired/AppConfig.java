package com.sathish.autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.sathish.autowired")
@PropertySource("classpath:application.properties")
public class AppConfig {

	
//	@Bean
//	public AirtelSim getAirtelSim() {
//		return new AirtelSim();
//	}
//	
//	@Bean
//	public Phone getPhone() {
//		return new Phone(getAirtelSim());
//	}
}
