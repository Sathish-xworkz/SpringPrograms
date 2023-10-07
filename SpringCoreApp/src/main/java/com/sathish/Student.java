package com.sathish;

public class Student {
	
	private int sid;
	private  String name;
	
	private Book book;  // HAS-A
	
	
	public Student(int sid, String name, Book book) {
		super();
		this.sid = sid;
		this.name = name;
		this.book = book;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Student(int sid, String name) {
		super();
		this.sid = sid;
		this.name = name;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	System.out.println("Student Object is created.....");
	}
	
	public void reading() {
		System.out.println("Student reading books...");
	}
	public void coding() {
		System.out.println("student start coding...");
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", book=" + book + "]";
	}

}
