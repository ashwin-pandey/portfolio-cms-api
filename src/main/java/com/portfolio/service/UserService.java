package com.portfolio.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.beans.User;
import com.portfolio.repository.UserRepository;

@Service
public class UserService{
	@Autowired
	private UserRepository _userRepository;
	
	public List<User> getAll() {
		return _userRepository.getAll();
	}
	
	public Optional<User> getUser(int id) {
		Optional<User> user = _userRepository.findById(id);
		return user;
	}
	
	public User addUser(User user) {
		return _userRepository.save(user);
	}
	
	public User updateUser(User newUser, int id) {
		Date date = java.util.Calendar.getInstance().getTime();
		return _userRepository.findById(id)
		.map(user -> {
			user.setPassword(newUser.getPassword());
			user.setPhone_Number(newUser.getPhone_Number());
			user.setFirstName(newUser.getFirstName());
			user.setLastName(newUser.getLastName());
			user.setCountry(newUser.getCountry());
			user.setDescription(newUser.getDescription());
//			user.setDesignation_Id(newUser.getDesignation_Id());
			user.setUpdatedDate(date);
			return _userRepository.save(user);
			
		})
		.orElseGet(() -> {
			newUser.setId(id);
			return _userRepository.save(newUser);
		});
		
		
	}

	private Optional<User> map(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteUser(int id) {
		_userRepository.delete(id);
	}
	
		
}
