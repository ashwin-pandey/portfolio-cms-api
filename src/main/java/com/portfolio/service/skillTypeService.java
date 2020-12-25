package com.portfolio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import antlr.collections.List;

@Service
public class skillTypeService {
	@Autowired
	private skillTypeService skillTypeRepository;
	
	public List getAll() {
		return (List) skillTypeRepository.getAll();
	}
}
