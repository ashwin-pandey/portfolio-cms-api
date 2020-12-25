package com.portfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.service.designationsService;

import antlr.collections.List;

@RestController
public class designationsController {
	@Autowired
	private designationsService designationsService;
	
	@GetMapping
	@ResponseBody
	public List getAlldesignations() {
		return designationsService.getAll();
	}
}
