package com.portfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.service.userRoleService;
import antlr.collections.List;

@RestController
public class userRoleController {
	@Autowired
	private userRoleService userRoleService;
	
	@GetMapping
	@ResponseBody
	public List getAlluserRole() {
		return userRoleService.getAll();
	}
}
