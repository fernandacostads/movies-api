package com.lead.dell.movies.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lead.dell.movies.entities.*;

public interface MovieRepository extends JpaRepository<Movie, Long> {

	Movie findById(long movieId);
	
}
