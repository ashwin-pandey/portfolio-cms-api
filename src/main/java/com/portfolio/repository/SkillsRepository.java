package com.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.portfolio.beans.Skills;
import com.portfolio.beans.User;



@Repository

public interface SkillsRepository extends JpaRepository<User, String> {
	@Query(value = "FROM Skills")
	java.util.List<Skills> getAll();

	void deleteById(int id);

	Skills findById(int id);
}
