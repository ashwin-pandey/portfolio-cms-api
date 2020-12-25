package com.portfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.service.userService;

import antlr.collections.List;

@RestController
public class UserController {
	@Autowired
	private userService userservice;
	
	@GetMapping(path = "/user/all")
	@ResponseBody
	public List getAllUsers() {
		return userservice.getAll();
	}
}
