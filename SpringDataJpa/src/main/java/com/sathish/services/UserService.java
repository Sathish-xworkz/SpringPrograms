package com.sathish.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathish.model.User;
import com.sathish.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository  userRepository;
	
	private Logger logger=LoggerFactory.getLogger(getClass());
	public void saveToDB(User user) {
		
		logger.info("user info->{}",user);
		userRepository.save(user);
		
	}
}
