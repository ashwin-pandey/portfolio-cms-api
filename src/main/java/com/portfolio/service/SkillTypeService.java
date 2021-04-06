package com.portfolio.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.beans.SkillType;
import com.portfolio.repository.SkillTypeRepository;

import antlr.collections.List;

@Service
public class SkillTypeService {
	
	@Autowired
	private SkillTypeRepository _skillTypeRepository;
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

	public SkillType updateSkillType(SkillType newSkillType, int id) {
				return _skillTypeRepository.findById(id)
						.map(skillType -> {
							skillType.setName(newSkillType.getName());
							return _skillTypeRepository.save(skillType);
						})
						.orElseGet(() -> {
							newSkillType.setId(id);
							return _skillTypeRepository.save(newSkillType);
						});
	}

	public void deleteSkillType(int id) {
		_skillTypeRepository.deleteById(id);
		
	}

	

	
	

}
