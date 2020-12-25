package com.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import antlr.collections.List;

@Repository
public interface DesignationsRepository extends JpaRepository<DesignationsRepository, String> {

	@Query(value = "FROM designations")
	List getrAll();
}
