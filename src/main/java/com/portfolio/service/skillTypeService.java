package com.portfolio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.repository.SkillTypeRepository;
import com.portfolio.beans.SkillType;

import java.util.List;

@Service
public class SkillTypeService {
	@Autowired
	private SkillTypeRepository _skillTypeRepository;
	
	public List<SkillType> getAll() {
		return _skillTypeRepository.getAll();
	}
}
