package com.lead.dell.movies.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.lead.dell.movies.entities.*;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	List<User> findById(long userId);
	List<User> findByActive(boolean active);
	Optional<User> findByUserName(String userName);
}