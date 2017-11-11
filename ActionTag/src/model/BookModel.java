package model;

import java.util.ArrayList;
import java.util.List;

import entities.*;

public class BookModel {
	public List<Book> findAll() {
		List<Book> books = new ArrayList<Book>();
		books.add(new Book("p01","C#"));
		books.add(new Book("p02","Java"));
		books.add(new Book("p03","ASP.NET"));
		books.add(new Book("p04","PHP"));
		books.add(new Book("p05","IOS"));
		books.add(new Book("p06","Android"));
		return books;
	}
	
	public Book find(String id) {
		for (Book book : findAll()) {
			if(book.getId().equalsIgnoreCase(id)){
				return book;
			}
		}
		return null;
		
	}
}
