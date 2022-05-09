package com.me.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.me.entity.Book;
import com.me.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;
	
	@GetMapping(value = "/getAll")
	public List<Book> getBooks() {
		return bookService.getBooks();
	}

	
	
}
