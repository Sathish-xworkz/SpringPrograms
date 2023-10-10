package com.sathish.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Product {

	private int pid;
	 private String pname;
	
	public Product() {
		// TODO Auto-generated constructor stub
	System.out.println("Product Obj is created...");
	}

	public Product(int pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + "]";
	}
	
	
	// Lifecycle methods
	// this method works automaticall when bean is instantiated.( Object is created)
	@PostConstruct
	public void init() throws Exception {
		// any logic ............
		System.out.println(" init() method execute after bean created... ");
	}
	
	void disp() {
		System.out.println("Pid:"+pid);
		System.out.println("PName:"+pname);
	}
	
	@PreDestroy
	public void destroy() throws Exception{
		System.out.println("destory () execute after close ");
	}
	
	public void close() {
		System.out.println("closing resources...");
	}
}
