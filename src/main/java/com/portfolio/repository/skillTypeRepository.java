package com.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.portfolio.beans.SkillType;

import java.util.List;

@Repository
public interface SkillTypeRepository extends JpaRepository<SkillType, String>{
	
	@Query(value = "FROM skillType")
	List<SkillType> getAll();

}
