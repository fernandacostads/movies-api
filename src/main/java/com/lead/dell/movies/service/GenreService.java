package com.lead.dell.movies.service;

import com.lead.dell.movies.repository.GenreRepository;
import com.lead.dell.movies.entities.Genre;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class GenreService {

	@Autowired
	GenreRepository genreRepository;


	public Genre save(@RequestBody Genre genre) {
		return genreRepository.save(genre);
	}


	public List<Genre> findAll() {
		return genreRepository.findByActive(true);
	}


	public Optional<Genre> findOne(Long genreId) {

		return genreRepository.findById(genreId);
	}


	public Genre delete(Genre genre) {		
		genre.setActive(false);
		return genreRepository.save(genre);
	}


	public Genre updateGenre(long genreId, Genre genre) {
		return genreRepository.save(genre);
	}


	public Optional<Genre> findById(Long genreId) {
		return genreRepository.findById(genreId);
	}

}