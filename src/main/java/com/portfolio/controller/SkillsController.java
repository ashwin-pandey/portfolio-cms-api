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

import com.portfolio.beans.Skills;
import com.portfolio.service.SkillsService;

@RestController
public class SkillsController {
	@Autowired
	private SkillsService _skillsService;
	
	
	@GetMapping(path = "skills/all")
	@ResponseBody
	@ResponseStatus(code = HttpStatus.OK)
	public List<Skills> getASkills(){
		return _skillsService.getAll();
	}
	
	
	@GetMapping(path = "skills/{id}")
	@ResponseBody
	@ResponseStatus(code = HttpStatus.OK)
	public Optional<Skills> getSkills(@PathVariable("id") int id){
		return _skillsService.getSkills(id);
	}
	
	@PostMapping(path = "/skills")
	@ResponseBody
	@ResponseStatus(code = HttpStatus.CREATED)
	public Skills addSkills (@RequestBody Skills skills) {
		return _skillsService.addSkills(skills);
	}
	
	@PutMapping(path = "/skills/{id}")
	@ResponseBody
	@ResponseStatus(code = HttpStatus.CREATED)
	public Skills updateSkills (@RequestBody Skills skills, @PathVariable("id") int id) {
		return _skillsService.updateSkills(skills, id);
	}
	
	@DeleteMapping(path = "/skills/{id}")
	public void deleteSkills (@PathVariable ("id") int id) {
		_skillsService.deleteSkills(id);
	}

}
