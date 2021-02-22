package com.portfolio.service;

import com.portfolio.beans.SkillType;

import antlr.collections.List;

public class SkillTypeService {

	public List getAll;

	public Object getAll() {
		return null;
	}

	public java.util.Optional<SkillType> getSkillType(int id) {
		return null;
	}

	public SkillType addSkillType(String skilltype) {
		return null;
	}

	public SkillType updateSkillType(SkillType skillType, int id) {
		return _skillTypeRepository.findById(id)
				return _skillTypeRepository.findById(id)
						.map(project -> {
							skillsType.setName(newSkillType.getName());
						})
						.orElseGet(() -> {
							newProject.setId(id);
							return _projectRepository.save(newProject);
						});
	}

	public void deleteSkillType(int id) {
		_skillTypeRepository.deleteById(id);
		
	}

	

	
	

}
