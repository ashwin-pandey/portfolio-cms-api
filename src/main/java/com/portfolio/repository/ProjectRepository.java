package com.portfolio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.portfolio.beans.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer> {

	@Query(value = "FROM Project")
	List<Project> getAll();
	
}
