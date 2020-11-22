package com.portfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.portfolio.beans.Project;
import com.portfolio.repository.ProjectRepository;

public class ProjectService {

	@Autowired
	private ProjectRepository projectRepository;
	
	public List<Project> getAll() {
		return projectRepository.getAll();
	}
	
}
