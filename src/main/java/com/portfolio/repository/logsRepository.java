package com.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.portfolio.beans.logs;

import antlr.collections.List;

@Repository
public interface logsRepository extends JpaRepository<logs, Integer>{

	@Query(value = "FROM logsRepository")
	List getAll();
}
