package com.lead.dell.movies.service;

import com.lead.dell.movies.repository.MovieRepository;
import com.lead.dell.movies.entities.Movie;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class MovieService {

	@Autowired
	MovieRepository movieRepository;


	public Movie save(@RequestBody Movie movie) {
		return movieRepository.save(movie);
	}


	public List<Movie> findAll() {
		return movieRepository.findByActive(true);
	}


	public Optional<Movie> findOne(Long movieId) {

		return movieRepository.findById(movieId);
	}


	public Movie delete(Movie movie) {		
		movie.setActive(false);
		return movieRepository.save(movie);
	}


	public Movie updateMovie(long movieId, Movie movie) {
		return movieRepository.save(movie);
	}


	public Optional<Movie> findById(Long movieId) {
		return movieRepository.findById(movieId);
	}

}