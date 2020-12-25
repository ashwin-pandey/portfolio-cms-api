package com.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import antlr.collections.List;

@Repository
public interface designationsRepository extends JpaRepository<designationsRepository, String> {

	@Query(value = "FROM designations")
	List getrAll();
}
