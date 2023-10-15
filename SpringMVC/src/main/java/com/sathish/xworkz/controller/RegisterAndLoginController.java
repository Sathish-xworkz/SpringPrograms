package com.sathish.xworkz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sathish.xworkz.services.RegisterAndLoginService;

@Controller
public class RegisterAndLoginController {

	@Autowired
	private RegisterAndLoginService registerAndLoginService;
	
	@PostMapping("/newreg")
	public String register(@RequestParam("user") String user, @RequestParam("pass") String pass) {

		System.out.println("userName" + user);
		System.out.println("password " + pass);

		return "register";

	}

	@PostMapping("/userlogin")
	public String login(@RequestParam("user") String user, @RequestParam("pass") String pass) {
		return  registerAndLoginService.validate(user, pass);
	}

}
