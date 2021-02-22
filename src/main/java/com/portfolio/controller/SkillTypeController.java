package com.portfolio.controller;

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

import com.portfolio.beans.SkillType;
import com.portfolio.service.SkillTypeService;

@RestController
public class SkillTypeController {
	@Autowired
	private SkillTypeService _skillTypeService;
	
	@GetMapping(path = "/skillType/all")
	@ResponseBody
	@ResponseStatus(code = HttpStatus.OK)
	public SkillType getAllSkillType() {
		return   (SkillType) _skillTypeService.getAll();
	}
	
	
	@GetMapping(path = "/skillType/{id}")
	@ResponseBody
	@ResponseStatus(code = HttpStatus.OK)
	public Optional<SkillType> getSkilltype(@PathVariable("id") int id) {
		return _skillTypeService.getSkillType(id);
	}
	
	@PostMapping(path = "/killTypeS")
	@ResponseBody
	@ResponseStatus(code = HttpStatus.CREATED)
	public SkillType addSkillType(@RequestBody SkillTypeController controller, String skillType) {
		return _skillTypeService.addSkillType(skillType);
	}
	
	@PutMapping(path = "/skillType/{id}")
	@ResponseBody
	@ResponseStatus(code = HttpStatus.CREATED)
	public SkillType updateSkillType(@RequestBody SkillType skillType , @PathVariable ("id") int id) {
		return  (SkillType) _skillTypeService.updateSkillType(skillType, id);
	}
	
	@DeleteMapping(path = "/skillType/{id}")
	public void deleteSkillType(@PathVariable("id") int id) {
		_skillTypeService.deleteSkillType(id);
	}
	
}
