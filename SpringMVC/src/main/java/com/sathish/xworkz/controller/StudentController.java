package com.sathish.xworkz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sathish.xworkz.model.Student;
import com.sathish.xworkz.services.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("regStudent")
	public String addStudent(@ModelAttribute("student") Student student) {
		
		System.out.println(student);
		studentService.saveStudent(student);
		return "home";
	}
	
}
