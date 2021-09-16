package com.lead.dell.movies.service;

import com.lead.dell.movies.repository.MovieRepository;
import com.lead.dell.movies.entities.Movie;
import com.lead.dell.movies.exception.EmptyInputException;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class MovieService {

	@Autowired
	MovieRepository movieRepository;


	public Movie save(@RequestBody Movie movie) {

		if(movie.getTitle().isEmpty() || movie.getTitle().length() == 0) {
			throw new EmptyInputException("601", "Input fields are empty!");
		}

		return movieRepository.save(movie);
	}


	public List<Movie> findAll() {
		return movieRepository.findByActive(true);
	}


	public Optional<Movie> findOne(Long movieId) {

		return movieRepository.findById(movieId);
	}


	public Movie delete(Movie movie) {	

		if(movie == null ) throw new NoSuchElementException("Not found! id" + movie.getMovieId());

		movie.setActive(false);
		
		return movieRepository.save(movie);
	}


	public Movie updateMovie(long movieId, Movie movie) {
		
		Movie movieid = findByid(String.valueOf(movieId));

		if(movie == null) throw new NoSuchElementException("Not found! id" + movieId);
		
		return movieRepository.save(movie);
	}


	public Optional<Movie> findById(Long movieId) {

		Movie movie = findByid(String.valueOf(movieId));

		if(movie == null ) throw new NoSuchElementException("Not found! id" + movieId);


		return movieRepository.findById(movieId);
	}


	private Movie findByid(String valueOf) {
		// TODO Auto-generated method stub
		return null;
	}

}