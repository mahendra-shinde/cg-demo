package com.me.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.me.dao.BookRepository;
import com.me.entity.Book;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepo;
	
	@Override
	public List<Book> getBooks() {
		return bookRepo.findAll();
	}

	@Override
	public void save(Book book) {
		bookRepo.save(book);
	}

		//Add some sample data
	@PostConstruct
	public void initData(){
		bookRepo.save(new Book(1,"Let Us C","Yashwant Kanetkar", 380));
		bookRepo.save(new Book(2,"Let Us C++","Yashwant Kanetkar", 430));
	}
}