package com.portfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.beans.User;
import com.portfolio.service.UserService;

import java.util.List;

@RestController
public class UserController {
	@Autowired
	private UserService _userservice;
	
	@GetMapping(path = "/user/all")
	@ResponseBody
	public List<User> getAllUsers() {
		return _userservice.getAll();
	}
}
