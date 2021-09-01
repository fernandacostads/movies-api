package com.lead.dell.movies.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lead.dell.movies.entities.*;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {

	Genre findById(long genreId);
	
}
