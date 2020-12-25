package com.portfolio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.beans.Project;
import com.portfolio.repository.ProjectRepository;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepository _projectRepository;
	
	public List<Project> getAll() {
		return _projectRepository.getAll();
	}
	
	public Optional<Project> getProject(int id) {
		Optional<Project> project = _projectRepository.findById(id);
		return project;
	}
	
	public Project addProject(Project project) {
		return _projectRepository.save(project);
	}
	
	public Project updateProject(Project newProject, int id) {
		return _projectRepository.findById(id)
				.map(project -> {
					project.setName(newProject.getName());
					project.setProjectLink(newProject.getProjectLink());
					project.setThumbnailLink(newProject.getThumbnailLink());
					return _projectRepository.save(project);
				})
				.orElseGet(() -> {
					newProject.setId(id);
					return _projectRepository.save(newProject);
				});
	}
	
	public void deleteProject(int id) {
		_projectRepository.deleteById(id);
	}
	
}
