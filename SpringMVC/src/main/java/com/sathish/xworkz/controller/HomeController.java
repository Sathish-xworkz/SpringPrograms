package com.sathish.xworkz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/reg")
	public String goRegister() {
		System.out.println(" home controller...");
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
	

	
	
	
	
	
	
}
