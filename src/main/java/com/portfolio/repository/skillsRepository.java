package com.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.portfolio.beans.Skills;

import antlr.collections.List;

@Repository
public interface SkillsRepository extends JpaRepository<Skills, String> {
	
	@Query(value = "FROM skills")
	List getAll();

}
