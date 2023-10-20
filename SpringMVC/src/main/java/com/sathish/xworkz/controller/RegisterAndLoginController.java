package com.sathish.xworkz.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sathish.xworkz.services.RegisterAndLoginService;

@Controller
public class RegisterAndLoginController {
	private static Logger logger = LoggerFactory.getLogger(RegisterAndLoginController .class);
	@Autowired
	private RegisterAndLoginService registerAndLoginService;
	@PostMapping("/newreg")
	public String register(@RequestParam("user") String user, @RequestParam("pass") String pass) {

		//System.out.println("userName" + user);
		//System.out.println("password " + pass);
		logger.info("Register page data {}",user);
		logger.info("passwod {}",pass);
		return "register";

	}

//	@PostMapping("/userlogin")
//	public String login(@RequestParam("user") String user, @RequestParam("pass") String pass) {
//		return  registerAndLoginService.validate(user, pass);
//	}
	
	@PostMapping("/userlogin")
	public ModelAndView login(@RequestParam("user") String user, @RequestParam("pass") String pass) {
		String pagname= registerAndLoginService.validate(user, pass);

		ModelAndView mv=new ModelAndView();
		mv.setViewName(pagname);
		mv.addObject("username", user);
		
		int phone=988067224;
		String names[]= {"sathish","divya","jaya","deepti"};
		mv.addObject("ph", phone);
		mv.addObject("names", names);
		return mv;
	}
	
	

}
