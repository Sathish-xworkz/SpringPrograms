package com.sathish.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppAnnotationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext apx=new AnnotationConfigApplicationContext(JavaConfig.class);
		Products p= apx.getBean(Products.class);
		System.out.println(p);
	}

}
