package com.portfolio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.beans.User;
import com.portfolio.repository.UserRepository;

import java.util.List;

@Service
public class UserService {
	@Autowired
	private UserRepository _userRepository;
	
	public List<User> getAll() {
		return _userRepository.getAll();
	} 
}
