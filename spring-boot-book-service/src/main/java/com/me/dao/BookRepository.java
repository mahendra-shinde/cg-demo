package com.me.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.me.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}