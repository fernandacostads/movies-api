package com.lead.dell.movies.controller;

import com.lead.dell.movies.entities.Movie;
import com.lead.dell.movies.service.MovieService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class MovieController {

	@Autowired
	MovieService movieService;


	@PostMapping("/add-movie")
	public Movie createMovie(@RequestBody Movie movie) {
		return movieService.save(movie);
	}


	@GetMapping("/listall-movie")
	public List<Movie> getAllMovies(){
		return movieService.findAll();
	}


	@GetMapping("/list-movie/{movieId}")
	public Optional<Movie> getMovieById(@PathVariable long movieId){
		return movieService.findById(movieId);
	}


	@PutMapping("/edit-movie/{movieId}")
	public Movie updateMovie(@RequestBody Movie movie, @PathVariable long movieId) {
		return movieService.updateMovie(movieId, movie);
	}


	@PutMapping("/delete-movie/{movieId}")
	public Movie deleteGenre(@RequestBody Movie movie, @PathVariable long movieId) {
		return movieService.delete(movie);
	}


}

