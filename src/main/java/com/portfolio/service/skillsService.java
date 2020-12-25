package com.portfolio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.repository.skillsRepository;

import antlr.collections.List;

@Service
public class skillsService {
	@Autowired
	private skillsRepository skillsRepository;
	
	public List getAll() {
		return skillsRepository.getAll();
	}

}
