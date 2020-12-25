package com.portfolio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import antlr.collections.List;

@Service

public class DesignationsService {
    @Autowired
    private DesignationsService _designationsService;
    
    public List getAll() {
    	return _designationsService.getAll();
    }
}
