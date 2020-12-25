package com.portfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.service.LogsService;

import antlr.collections.List;

@RestController
public class LogsController {
	@Autowired
	private LogsService _logsService;
	
	@GetMapping
	@ResponseBody
	public List getAlllogs() {
		return _logsService.getAll();
	}
	
}
