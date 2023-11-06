package com.sathish.services;

import java.util.List;
import java.util.Optional;

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
	
	// retrive data 
	public List<User> getAllUser(){
		return  (List<User>) userRepository.findAll();
	}
	
	//deleteById
	
	public void deleteById(int id) {
		userRepository.deleteById(id);
	}
	
	//fetch byId
	
	public User fetchById(int id) {
		
		return userRepository.findById(id).get();
	}
	
	public void updateUser(User user) {
		System.out.println(user);
		userRepository.save(user);
////		userRepository.updateUserDB(user);
	}
	
	

}
