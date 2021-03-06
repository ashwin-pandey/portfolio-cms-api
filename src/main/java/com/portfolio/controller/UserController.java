package com.portfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.beans.User;
import com.portfolio.service.UserService;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
	@Autowired
	private UserService _userService;
	
	@GetMapping(path = "/user/all")
	@ResponseBody
	@ResponseStatus(code = HttpStatus.OK)
	public List<User> getAllUsers() {
		return _userService.getAll();
	}
	@GetMapping(path = "/user{id}")
	@ResponseBody
	@ResponseStatus(code = HttpStatus.OK)
	public Optional<User> getUsers(@PathVariable("id") int id) {
		return _userService.getUser(id);
	}
	
	@PostMapping(path = "/user")
	@ResponseBody
	@ResponseStatus(code = HttpStatus.CREATED)
	public User addUser(@RequestBody User user) {
		return _userService.addUser(user);
	}
	
	@PutMapping(path = "/user/{id}") 
	@ResponseBody
	@ResponseStatus(code = HttpStatus.CREATED)
	public User updateUser(@RequestBody User user, @PathVariable("id") int id) {
		return _userService.updateUser(user, id);
	}
	
	@DeleteMapping
	public void deleteUser(@PathVariable("id") int id) {
		_userService.deleteUser(id);
	}
	
}

