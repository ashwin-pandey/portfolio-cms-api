package com.portfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.beans.UserRole;
import com.portfolio.service.UserRoleService;
import java.util.List;

@RestController
public class UserRoleController {
	@Autowired
	private UserRoleService _userRoleService;
	
	@GetMapping
	@ResponseBody
	public List<UserRole> getAlluserRole() {
		return _userRoleService.getAll();
	}
}
