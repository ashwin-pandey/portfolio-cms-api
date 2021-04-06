package com.portfolio.service;

import com.portfolio.beans.UserRoles;
import com.portfolio.repository.UserRolesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRolesService {
	
	@Autowired
	private UserRolesRepository _userRolesRepository;

	public String getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getUserRoles() {
		// TODO Auto-generated method stub
		return null;
	}

	public UserRoles addUserRoles(UserRoles userRoles) {
		// TODO Auto-generated method stub
		return null;
	}

	public UserRoles updateUserRoles(UserRoles newUserRoles, int id) {
		// TODO Auto-generated method stub
//		return _userRolesRepository.findById(id)
		return _userRolesRepository.findById(id)
				.map(userRoles -> {
					userRoles.setName(newUserRoles.getName());
					return _userRolesRepository.save(userRoles);
					
				})
				.orElseGet(() -> {
					newUserRoles.setId(id);
					return _userRolesRepository.save(newUserRoles);
				});
	}

	public void deleteUserRoles(int id) {
		// TODO Auto-generated method stub
		_userRolesRepository.deleteById(id);
		
	}

	
}
