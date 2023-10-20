package com.sathish.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sathish.model.User;
import com.sathish.services.UserService;

@Controller
public class UserController {

	private Logger logger=LoggerFactory.getLogger(getClass());
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/reg")
	public String register() {
		return "register";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@PostMapping("/reguser")
	public String newUserReg(@ModelAttribute("user") User user) {
		logger.info("User date:->{}",user);
		userService.saveToDB(user);
		return"register";
	}
}
