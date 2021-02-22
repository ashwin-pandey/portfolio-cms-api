package com.portfolio.service;

import com.portfolio.beans.UserRoles;

public class UserRolesService {

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

	public UserRoles updateUserRoles(UserRoles userRoles) {
		// TODO Auto-generated method stub
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

	public void deleteUserRoles() {
		// TODO Auto-generated method stub
		_userRolesRepository.deleteById(id);
		
	}

	
}
