package com.sathish.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		new Phone().insertSim();
		
		ApplicationContext apx=new AnnotationConfigApplicationContext(AppConfig.class);
		Phone p= apx.getBean(Phone.class);
		p.insertSim();
		p.phoneSpecfic();
		
	}

}
