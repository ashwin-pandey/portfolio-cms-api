package com.portfolio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.repository.SkillsRepository;

import antlr.collections.List;

@Service
public class SkillsService {
	@Autowired
	private SkillsRepository _skillsRepository;
	
	public List getAll() {
		return _skillsRepository.getAll();
	}

}
