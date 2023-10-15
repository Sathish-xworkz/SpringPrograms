package com.sathish.xworkz.services;

import org.springframework.stereotype.Service;

@Service
public class RegisterAndLoginService {

	public String validate(String user,String pass) {
		
		if (user.equalsIgnoreCase("sathish") && pass.equalsIgnoreCase("123")) {
			return "home";
		} else {
			return "error";
		}
	}
}
