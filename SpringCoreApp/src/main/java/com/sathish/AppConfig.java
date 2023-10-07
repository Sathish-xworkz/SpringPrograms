package com.sathish;

import org.springframework.context.annotation.Bean;

public class AppConfig {

	/*
	 * @Bean public Student getStudent() { // Student s= // s.setSid(234); //
	 * s.setName("sathish"); return new Student(); } // @Bean("myst") // public
	 * Student getStudents() { // return new Student(); // } // Student mystu=new
	 * Student();
	 */

//	@Bean
//	public Student createStudent() {
//		return new Student(123, "jaya");
//	}

	@Bean
	public Book createbook() {
		Book b=new Book();
		b.setBid(222);
		b.setName("Java");
		
		return b;
	}

//	@Bean
//	public Book createbook() {
//		Book b = new Book();
//		return b;
//	}

//	
//	@Bean
//	public Student studentObj() {
//		Student s=new Student();
//		s.setSid(123);
//		s.setName("sathish");
//		s.setBook(createbook());
//		
//		return s;
//		
//	}

	@Bean
	public Student studentObj() {
		Student s = new Student(122, "ramya", createbook());
		return s;
	}
}
