package com.portfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.beans.SkillType;
import com.portfolio.service.SkillTypeService;

import java.util.List;

@RestController
public class SkillTypesController {
	@Autowired
	private SkillTypeService _skillTypeService;
	
	@GetMapping
	@ResponseBody
	public List<SkillType> getAllskillType() {
		return _skillTypeService.getAll();
	}
}
