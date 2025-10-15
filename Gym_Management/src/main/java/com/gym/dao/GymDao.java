package com.gym.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gym.entities.Gym;



@Repository
public class GymDao {

	@Autowired
	SessionFactory factory;

	public String insertData(Gym g) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(g);
		tx.commit();
		session.close();
		String msg="Data is Inserted..!";
		return msg;
	}
}
