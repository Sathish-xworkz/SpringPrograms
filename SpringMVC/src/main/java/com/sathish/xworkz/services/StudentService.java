package com.sathish.xworkz.services;

import org.springframework.stereotype.Service;

import com.sathish.xworkz.model.Student;
import com.sathish.xworkz.repository.StudentRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StudentService {

	private StudentRepository studentRepository;

	public void saveStudent(Student student) {
		System.out.println(" service...");
		System.err.println(student);
		studentRepository.save(student); // pass to repo

	}
}
