package com.portfolio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.portfolio.beans.Project;
import com.portfolio.service.ProjectService;

public class ProjectController {

	@Autowired
	private ProjectService projectService;
	
	@GetMapping(path = "/api/project/all")
	@ResponseBody
	public List<Project> getAllProject() {
		return projectService.getAll();
	}
	
}
