package com.lead.dell.movies.advice;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.lead.dell.movies.exception.EmptyInputException;

@ControllerAdvice
public class MyControllerAdvice {

	@ExceptionHandler(EmptyInputException.class)
	public ResponseEntity<String> handleEmptyInput(EmptyInputException emptyInputException) {

		return new ResponseEntity<String>("Input field is Empty, please look into it.", HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<String> handleNoSuchElementException(NoSuchElementException elementException) {

		return new ResponseEntity<String>("Value isn't present in Database, please change your request!", HttpStatus.NOT_FOUND);
	}
}
