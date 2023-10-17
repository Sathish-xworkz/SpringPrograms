package com.sathish.xworkz.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

	private int id;
	private String name;
	private String course;
	private String branch;
	private int rollno;
	private String email;
}
