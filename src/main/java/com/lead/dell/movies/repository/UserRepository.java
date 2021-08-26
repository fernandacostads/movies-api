package com.lead.dell.movies.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.lead.dell.movies.entities.*;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	List<User> findById(long userId);

	
}
