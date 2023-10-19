package com.sathish.xworkz.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	private static Logger logger = LoggerFactory.getLogger(HomeController.class);
	public HomeController() {
		// TODO Auto-generated constructor stub
//		Logger.info("HomeController loading...");
	}
	@RequestMapping("/reg")
	public String goRegister() {
		//System.out.println(" home controller...");
		logger.info("Register page is loading...");
		return "register";
	}
	
	@RequestMapping("/login")
	public String goLogin() {
		System.out.println("login clicked...");
		return "login";
	}
	
	@RequestMapping("/home")
	public String home() {
		return "index";
	}
	
	@RequestMapping("/studentReg")
	public String studentReg() {
		return "studentReg";
	}
	
	
	
	
	
	
	
}
