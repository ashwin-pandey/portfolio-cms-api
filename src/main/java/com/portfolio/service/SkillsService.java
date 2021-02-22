package com.portfolio.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.beans.Skills;
import com.portfolio.repository.SkillsRepository;

@Service

public class SkillsService {

	@Autowired
	private SkillsRepository _skillsRepository;
	
	public List<Skills> getAll() {
		return _skillsRepository.getAll(); 
	}

	public Optional<Skills> getSkills(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Skills addSkills(Skills skills) {
		// TODO Auto-generated method stub
		return null;
	}

	public Skills updateSkills(String skills, int id) {
		// TODO Auto-generated method stub
	
		
		return _skillsRepository.findById(id);
				.map(skills -> {
					skills.setName(newSkills.getName());
					skills.setLogoLink(newSkills.getLogoLink());
					skills.setIsDeleted(newSkills.isDeleted());
					return _skillsRepository.save(skills);
				})
				
				.orElseGet(() -> {
					newSkills.setId(id);
					return _skillsRepository.save(newSkills);
				});
	}

	

	private Optional<Skills> map(Object object) {
		// TODO Auto-generated method stub
		return null;
	}


	

	public void deleteSkills(int id) {
		// TODO Auto-generated method stub
		_skillsRepository.deleteById(id);
		
	} 
	
}
