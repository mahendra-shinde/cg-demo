package com.me.controllers;

import com.me.entity.Book;
import java.io.IOException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
@Controller
@RequestMapping("/")
public class BookListClientController {
	
	@Value("${BOOKSERVICE}")
	private String bookServiceUrl;

	@GetMapping	
	public String getBookList(ModelMap model) {
			
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Book[]> response=null;
		try{
		response=restTemplate.exchange(bookServiceUrl+"/getAll",
				HttpMethod.GET, getHeaders(), Book[].class);
		model.addAttribute("books", Arrays.asList(response.getBody()));	
		}catch (Exception ex)
		{
			model.addAttribute("error",ex.getMessage());
		}
		return "books";
	}

	private static HttpEntity<?> getHeaders() throws IOException {
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		return new HttpEntity<>(headers);
	}
}