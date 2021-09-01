package com.lead.dell.movies.controller;

import com.lead.dell.movies.entities.Genre;
import com.lead.dell.movies.service.GenreService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
//@RequestMapping(value="/")
public class GenreController {

	@Autowired
	GenreService genreService;
	
	
	@PostMapping("/genre")
	public Genre createGenre(@RequestBody Genre genre) {
		return genreService.save(genre);
	}
	
	
	@GetMapping("/genre")
	public List<Genre> getAllGenres(){
		return genreService.findAll();
	}
	
		
	@GetMapping("/genre/{genreId}")
	public Optional<Genre> getGenreById(@PathVariable long genreId){
		return genreService.findById(genreId);
	}
	
	
	@PutMapping("/genre/{genreId}")
	public Genre updateGenre(@RequestBody Genre genre, @PathVariable long genreId) {
		return genreService.updateGenre(genreId, genre);
	}

	
	@DeleteMapping("/genre/{genreId}")
	public Genre deleteGenre( Genre genre, @PathVariable long genreId) {
		return genreService.delete(genre);
	}
	
	
}

