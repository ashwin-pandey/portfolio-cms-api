package com.portfolio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import antlr.collections.List;

@Service

public class designationsService {
    @Autowired
    private designationsService designationsService;
    
    public List getAll() {
    	return designationsService.getAll();
    }
}
