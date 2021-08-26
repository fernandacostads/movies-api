package com.lead.dell.movies.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lead.dell.movies.entities.*;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

	Movie findById(long movieId);
	
}
