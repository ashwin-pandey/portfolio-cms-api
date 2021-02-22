package com.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.portfolio.beans.SkillType;

import antlr.collections.List;

@Repository
public interface SkillTypeRepository extends JpaRepository<SkillType, Integer>{
	@Query(value = "FROM SkillType")
	List getAll();
}
