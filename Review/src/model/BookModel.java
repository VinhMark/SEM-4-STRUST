package model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import entities.Book;

public class BookModel {
	private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	public List<Book> findAll() {
		List<Book> books = null;
		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();

			books = session.createQuery("from Book").list();

			transaction.commit();
		} catch (Exception e) {
			books = null;
			if (transaction != null) {
				transaction.rollback();
			}
		} finally {
			session.close();
		}
		return books;
	}

	public Book find(String bookId) {
		Book book = null;
		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();

			book = (Book) session.createQuery("from Book where bookId=:bookId").setString("bookId", bookId).uniqueResult();

			transaction.commit();
		} catch (Exception e) {
			book = null;
			if (transaction != null) {
				transaction.rollback();
			}
		} finally {
			session.close();
		}
		return book;
	}
//update
	public void Update(Book book) {

		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			// theem
			session.update(book);

			transaction.commit();

		} catch (Exception e) {

			if (transaction != null) {
				transaction.rollback();
			}
		} finally {
			session.close();
		}
	}
}
