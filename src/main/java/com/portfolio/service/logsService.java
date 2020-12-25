package com.portfolio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import antlr.collections.List;

@Service
public class logsService {
	@Autowired
	private logsService logsService;
	
	public List getAll() {
		return logsService.getAll();
	}
}
