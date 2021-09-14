package com.lead.dell.movies.controller;

import com.lead.dell.movies.entities.Genre;
import com.lead.dell.movies.service.GenreService;

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

public class GenreController {

	@Autowired
	GenreService genreService;


	@PostMapping("/add-genre")
	public Genre createGenre(@RequestBody Genre genre) {
		return genreService.save(genre);
	}


	@GetMapping("/listall-genre")
	public List<Genre> getAllGenres(){
		return genreService.findAll();
	}


	@GetMapping("/list-genre/{genreId}")
	public Optional<Genre> getGenreById(@PathVariable long genreId){
		return genreService.findById(genreId);
	}


	@PutMapping("/edit-genre/{genreId}")
	public Genre updateGenre(@RequestBody Genre genre, @PathVariable long genreId) {
		return genreService.updateGenre(genreId, genre);
	}


	@PutMapping("/delete-genre/{genreId}")
	public Genre deleteGenre(@RequestBody Genre genre, @PathVariable long genreId) {
		return genreService.delete(genre);
	}


}

