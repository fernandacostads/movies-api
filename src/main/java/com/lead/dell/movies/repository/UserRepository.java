package com.lead.dell.movies.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lead.dell.movies.entities.*;

public interface UserRepository extends JpaRepository<User, Long> {

	User findById(long userId);
	
}
