package controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import entities.Book;
import model.BookModel;

@ManagedBean(name="homeComtroller")
@SessionScoped
public class HomeComtroller {
	
	private List<Book> books;
	private Book book;
	private String id;
	
	public HomeComtroller() {
		BookModel bookModel = new BookModel();
		books = new ArrayList<Book>();
		books = bookModel.findAll();
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public String index() {
		BookModel bookModel = new BookModel();
		this.books = bookModel.findAll();
		return "/home/index.xhtml?faces-redirect=true";
	}
	public String update(Book book) {
		this.book = book;
		return "/home/update.xhtml?faces-redirect=true";
	}
}
