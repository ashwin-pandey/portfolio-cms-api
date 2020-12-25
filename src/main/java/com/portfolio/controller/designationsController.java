package com.portfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.service.DesignationsService;

import antlr.collections.List;

@RestController
public class DesignationsController {
	@Autowired
	private DesignationsService _designationsService;
	
	@GetMapping
	@ResponseBody
	public List getAlldesignations() {
		return _designationsService.getAll();
	}
}
