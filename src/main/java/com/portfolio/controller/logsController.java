package com.portfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.service.logsService;

import antlr.collections.List;

@RestController
public class logsController {
	@Autowired
	private logsService logsService;
	
	@GetMapping
	@ResponseBody
	public List getAlllogs() {
		return logsService.getAll();
	}
	
	
}
