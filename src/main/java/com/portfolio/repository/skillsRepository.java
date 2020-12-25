package com.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.portfolio.beans.skills;

import antlr.collections.List;

@Repository
public interface skillsRepository extends JpaRepository<skills, String> {
	
	@Query(value = "FROM skills")
	List getAll();

}
