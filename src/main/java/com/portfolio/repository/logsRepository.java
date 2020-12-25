package com.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.portfolio.beans.Logs;

import antlr.collections.List;

@Repository
public interface LogsRepository extends JpaRepository<Logs, Integer>{

	@Query(value = "FROM logsRepository")
	List getAll();
}
