package com.lead.dell.movies.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.lead.dell.movies.entities.*;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	static ResponseEntity<User> findById(long userId) {
		
		return null;
	}
	
}
