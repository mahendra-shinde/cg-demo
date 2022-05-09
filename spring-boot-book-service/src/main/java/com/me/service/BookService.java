package com.me.service;

import java.util.List;

import com.me.entity.Book;

public interface BookService {
	public List<Book> getBooks();
	public void save(Book book);
}