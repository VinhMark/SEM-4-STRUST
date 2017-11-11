package controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import entities.Book;
import model.BookModel;

@ManagedBean(name="bookManagedbean")
@SessionScoped
public class BookManagedbean {

	private Book book;
	

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	private List<Book> books;
	
	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public BookManagedbean() {
		this.book = new Book();
		BookModel bookModel = new BookModel();
		this.books = bookModel.findAll();
		book.setId("p01");
	}

	public void index() {
		BookModel bookModel = new BookModel();
		this.books = bookModel.findAll();
		
	}
	public String save() {
		BookModel bookModel = new BookModel();
		this.book = bookModel.find(this.book.getId());
		return "index?faces-redirect=true";
	}
}
