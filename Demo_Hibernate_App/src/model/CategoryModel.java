package model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import entities.Category;

public class CategoryModel {
	
	private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	
	@SuppressWarnings("unchecked")
	public List<Category> findAll() {
		List<Category> categories = null;
		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			transaction.commit();
			
			categories = session.createQuery("from Category").list();
			
			
		} catch (Exception e) {
			categories = null;
			if(transaction!=null){
				transaction.rollback();
			}
		}finally {
			session.close();
		}
		return categories;
	}
	
	@SuppressWarnings("unchecked")
	public Category find(int id) {
		Category category = null;
		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			transaction.commit();
			
			category = (Category) session.createQuery("from Category where id = :id").setInteger("id",id).uniqueResult();
			
			
		} catch (Exception e) {
			category = null;
			if(transaction!=null){
				transaction.rollback();
			}
		}finally {
			session.close();
		}
		return category;
	}
	
	@SuppressWarnings("unchecked")
	public void Create(Category category) {
		
		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			//theem 
			session.save(category);
			
			transaction.commit();

		} catch (Exception e) {
			
			if(transaction!=null){
				transaction.rollback();
			}
		}finally {
			session.close();
		}	
	}
	
	@SuppressWarnings("unchecked")
	public void Delete(Category category) {
		
		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			//theem 
			session.delete(category);
			
			transaction.commit();

		} catch (Exception e) {
			
			if(transaction!=null){
				transaction.rollback();
			}
		}finally {
			session.close();
		}	
	}
	
	@SuppressWarnings("unchecked")
	public void Update(Category category) {
		
		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			//theem 
			session.update(category);
			
			transaction.commit();

		} catch (Exception e) {
			
			if(transaction!=null){
				transaction.rollback();
			}
		}finally {
			session.close();
		}	
	}
	
}
