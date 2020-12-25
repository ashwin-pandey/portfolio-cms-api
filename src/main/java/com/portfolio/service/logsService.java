package com.portfolio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.repository.LogsRepository;

import antlr.collections.List;

@Service
public class LogsService {
	@Autowired
	private LogsRepository _logsService;
	
	public List getAll() {
		return _logsService.getAll();
	}
}
