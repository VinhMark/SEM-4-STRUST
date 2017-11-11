package model;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import entities.Product;

public class ProductModel {
	private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	@SuppressWarnings("unchecked")
	public List<Product> findAll() {
		List<Product> products = new ArrayList<Product>();
		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		try {

			transaction = session.beginTransaction();

			products = session.createQuery("from Product").list();

			transaction.commit();

		} catch (Exception e) {
			products = null;
			if (transaction != null) {
				transaction.rollback();
			}
		} finally {
			session.close();
		}

		return products;
	}

	@SuppressWarnings("unused")
	public Product find(int id) {
		Product product = new Product();
		Session session = sessionFactory.openSession();
		Transaction transaction = null;

		try {

			product = (Product) session.createQuery("from Product where id = :id").setParameter("id", id)
					.uniqueResult();

		} catch (Exception e) {
			product = null;
			if (transaction != null) {
				transaction.rollback();
			}
		} finally {
			session.close();
		}
		return product;
	}

	@SuppressWarnings("unused")
	public boolean update(Product product) {
		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		try {

			transaction = session.beginTransaction();

			session.update(product);

			transaction.commit();

			return true;
		} catch (Exception e) {

			if (transaction != null) {
				transaction.rollback();
			}
			return false;
		} finally {
			session.close();
		}
	}

	// delete product
	public boolean delete(int id) {
		Product product = find(id);
		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		try {

			transaction = session.beginTransaction();
			// ..
			session.delete(product);

			transaction.commit();
			return true;

		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			return false;
		} finally {
			session.close();
		}
	}
}
