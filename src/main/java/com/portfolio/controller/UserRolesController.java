package com.portfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.beans.UserRoles;
import com.portfolio.service.UserRolesService;



@RestController
public class UserRolesController {
	 @Autowired
	 private UserRolesService _userRolesService;
	 @GetMapping(path = "/userRoles/all")
	 @ResponseBody
	 @ResponseStatus(code = HttpStatus.OK)
	 public String getAllUserRoles() {
		 return _userRolesService.getAll();
	 }
	 
	 @GetMapping(path = "/userRoles/{roles}")
	 @ResponseBody
	 @ResponseStatus(code = HttpStatus.OK)
	 public UserRoles getUserRoles(int roles) {
		 return  _userRolesService.getUserRoles(roles);
	 }
	 
	 @PostMapping(path = "/userRoles")
	 @ResponseBody
	 @ResponseStatus(code = HttpStatus.CREATED)
	 public UserRoles addUserRoles(@RequestBody UserRoles userRoles) {
		 return _userRolesService.addUserRoles(userRoles);
	 }
	 
	 @PutMapping(path = "/userRoles/{roles}")
	 @ResponseBody
	 @ResponseStatus(code = HttpStatus.CREATED)
	 public UserRoles updateUserRoles(@RequestBody UserRoles userRoles, int roles) {
		 return _userRolesService.updateUserRoles(userRoles,roles);
	 }
	 
	@DeleteMapping(path = "/userRoles/roles")
	public void deleteUserRoles() {
		_userRolesService.deleteUserRoles();
	}
	 	
}
