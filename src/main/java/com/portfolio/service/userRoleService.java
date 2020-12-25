package com.portfolio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import antlr.collections.List;

@Service
public class userRoleService {
	@Autowired
	private userRoleService userRoleService;
	
	public List getAll() {
		return userRoleService.getAll();
	}
}
