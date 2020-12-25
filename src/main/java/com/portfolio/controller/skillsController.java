package com.portfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.service.skillsService;

import antlr.collections.List;

@RestController
public class skillsController {
	@Autowired
	private skillsService skillsService;
	
	@GetMapping(path = "/skills/all")
	@ResponseBody
	public List getAllskills() {
		return skillsService.getAll();
	}

}
