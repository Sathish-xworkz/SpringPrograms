package com.sathish.xworkz.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class RegisterAndLoginService {

	private Logger logger=LoggerFactory.getLogger(getClass());
	
	public String validate(String user,String pass) {
		logger.info("data is comming to services..{}",user);
		logger.info("data is comming to services..{}",pass);
		if (user.equalsIgnoreCase("sathish") && pass.equalsIgnoreCase("123")) {
			return "home";
		} else {
			return "error";
		}
	}
}
