package com.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.portfolio.beans.skillType;

import antlr.collections.List;

@Repository
public interface skillTypeRepository extends JpaRepository<skillType, String>{
	
	@Query(value = "FROM skillType")
	List getAll();

}
