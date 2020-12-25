package com.portfolio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.beans.UserRole;
import com.portfolio.repository.UserRoleRepository;

import java.util.List;

@Service
public class UserRoleService {
	
	@Autowired
	private UserRoleRepository _userRoleService;
	
	public List<UserRole> getAll() {
		return _userRoleService.getAll();
	}
}
