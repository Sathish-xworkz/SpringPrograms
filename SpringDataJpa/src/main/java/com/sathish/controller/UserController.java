package com.sathish.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
		return"index";
	}

	@RequestMapping("/view")
	public String viewAllUser(Model model) {
		List<User> userlist= userService.getAllUser();
		logger.info("userlist {}",userlist);
		model.addAttribute("userList", userlist);
		
		return "viewAllUser";
	}
	
	//delete byId
	@RequestMapping("/deleteUser")
	public String deleteuser(@RequestParam("id") int id) {
		logger.info("userId:{}",id);
		userService.deleteById(id);
		return "redirect:/view"; 
	}
	
	//edit byId
	@RequestMapping("/editUser")
	public String editUser(@RequestParam("id") int id,Model model) {
		logger.info("userId:{}",id);
		 User getUserData= userService.fetchById(id);
		 logger.info("edit data {}",getUserData);
		 model.addAttribute("user", getUserData);
		return "edituser";
	}
	
	//update user
	@RequestMapping("/update")
	public String updateUser(@ModelAttribute("update-user") User user) {
		logger.info("updated values{}",user);
		return "redirect:/view";
	}
	
	
	
	
}
