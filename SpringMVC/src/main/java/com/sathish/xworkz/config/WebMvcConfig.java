package com.sathish.xworkz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.sathish.xworkz")
@EnableWebMvc
public class WebMvcConfig {


	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver ivr=new InternalResourceViewResolver();
		ivr.setPrefix("/");
		ivr.setSuffix(".jsp");
		return ivr;
	}
	
	
}
