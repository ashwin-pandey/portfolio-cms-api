package com.portfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.service.skillTypeService;

import antlr.collections.List;

@RestController
public class skillTypesController {
	@Autowired
	private skillTypeService skillTypeService;
	
	@GetMapping
	@ResponseBody
	public List getAllskillType() {
		return skillTypeService.getAll();
	}
}
