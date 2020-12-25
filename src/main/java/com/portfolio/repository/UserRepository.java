package com.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.portfolio.beans.User;

import antlr.collections.List;

@Repository
public interface UserRepository extends JpaRepository<User, String>{
	
	@Query(value = "FROM User")
	List getAll();

}
