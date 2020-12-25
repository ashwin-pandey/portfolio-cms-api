package com.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import antlr.collections.List;

@Repository
public interface userRoleRepository extends JpaRepository<userRoleRepository, String> {
	
	@Query(value = "FROM userRole")
	List getAll();


}
