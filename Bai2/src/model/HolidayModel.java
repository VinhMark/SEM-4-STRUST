package model;

import entities.*;
import java.util.*;
import org.hibernate.*;

public class HolidayModel {

	private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	
	@SuppressWarnings("unchecked")
	public List<Holiday> search(Date from, Date to) {
		List<Holiday> holidays = null;
		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Query query = session.createQuery("from Holiday "
					+ "where fromDate >= :from and toDate <= :to");
			query.setDate("from", from);
			query.setDate("to", to);
			holidays = query.list();
			transaction.commit();
		} catch (Exception e) {
			holidays = null;
			if(transaction != null) {
				transaction.rollback();
			}
		} finally {
			session.close();
		}
		return holidays;
	}
	
	public void create(Holiday holiday) {
		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.save(holiday);
			transaction.commit();
		} catch (Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
		} finally {
			session.close();
		}
	}
	
}
