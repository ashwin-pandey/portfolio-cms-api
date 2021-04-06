package com.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.portfolio.beans.UserRoles;

@Repository
public interface UserRolesRepository extends JpaRepository<UserRoles, Integer> {
	@Query(value ="FROM UserRoles" )
	UserRoles getAll();
}
