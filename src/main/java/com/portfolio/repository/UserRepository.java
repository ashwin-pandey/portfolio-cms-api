package com.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.portfolio.beans.User;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, String>{
	
	@Query(value = "FROM User")
	List<User> getAll();

}
