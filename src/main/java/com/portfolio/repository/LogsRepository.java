package com.portfolio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.portfolio.beans.Logs;

@Repository
public interface LogsRepository extends JpaRepository<Logs, Integer> {
	@Query(value = "FROM logs")
	List<Logs> getAll();

}
