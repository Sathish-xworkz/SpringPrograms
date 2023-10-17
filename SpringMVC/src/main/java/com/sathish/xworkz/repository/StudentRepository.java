package com.sathish.xworkz.repository;

import org.springframework.stereotype.Repository;

import com.sathish.xworkz.model.Student;

@Repository
public class StudentRepository {

	public void save(Student student) {
		//....... DB logic
		System.out.println("Saved to DB..");
		System.out.println(student);
	}
}
