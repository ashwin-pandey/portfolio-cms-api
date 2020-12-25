package com.portfolio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.repository.UserRepository;

import antlr.collections.List;

@Service
public class userService {
	@Autowired
	private UserRepository userRepository;
	
	public List getAll() {
		return userRepository.getAll();
	} 
}
