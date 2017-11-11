package controller.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

import entities.Book;
import model.BookModel;

@Namespace("/home")
public class HomeAction extends ActionSupport {

	List<Book> books = null;
	Book book = null;
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Action(value = "index", results = { @Result(name = SUCCESS, location = "/home/index.jsp") })
	public String index() {
		BookModel model = new BookModel();
		this.books = model.findAll();
		return SUCCESS;
	}

	@Action(value = "update", results = { @Result(name = SUCCESS, location = "/home/update.jsp") })
	public String update() {
		BookModel model = new BookModel();
		this.book = model.find(id);
		return SUCCESS;
	}

	@Action(value = "save", results = { @Result(name = SUCCESS, type = "redirectAction", params = { "namespace",
			"/home", "actionName", "index" }) })
	public String save() {
		BookModel model = new BookModel();
		model.Update(this.book);
		return SUCCESS;
	}
}
