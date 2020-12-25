package com.portfolio.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.beans.Project;
import com.portfolio.service.ProjectService;

@RestController
public class ProjectController {

	@Autowired
	private ProjectService _projectService;
	
	/**
	 * This method is used to get all the projects.
	 * @return Returns a list of projects.
	 */
	@GetMapping(path = "/project/all")
	@ResponseBody
	@ResponseStatus(code = HttpStatus.OK)
	public List<Project> getAllProject() {
		return _projectService.getAll();
	}
	
	/**
	 * This method is used to get a specific project.
	 * @param id
	 * @return Returns a single Project object.
	 */
	@GetMapping(path = "/project/{id}")
	@ResponseBody
	@ResponseStatus(code = HttpStatus.OK)
	public Optional<Project> getProject(@PathVariable("id") int id) {
		return _projectService.getProject(id);
	}
	
	/**
	 * This method is used to create a new project into the database.
	 * @param project
	 * @return Returns the created project.
	 */
	@PostMapping(path = "/project")
	@ResponseBody
	@ResponseStatus(code = HttpStatus.CREATED)
	public Project addProject(@RequestBody Project project) {
		return _projectService.addProject(project);
	}
	
	/**
	 * This method is used to update an existing project.
	 * @param project
	 * @param id
	 * @return Returns the updated project.
	 */
	@PutMapping(path = "/project/{id}")
	@ResponseBody
	@ResponseStatus(code = HttpStatus.CREATED)
	public Project updateProject(@RequestBody Project project, @PathVariable("id") int id) {
		return _projectService.updateProject(project, id);
	}
	
	/**
	 * This method is used to delete a specific project.
	 * @param id
	 */
	@DeleteMapping(path = "/project/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void deleteProject(@PathVariable("id") int id) {
		_projectService.deleteProject(id);
	}
}
