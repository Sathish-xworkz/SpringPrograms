package com.sathish.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.sathish.model.User;

@Service
public class UserService {

	private Logger logger=LoggerFactory.getLogger(getClass());
	public void saveToDB(User user) {
		
		logger.info("user info->{}",user);
	}
}
