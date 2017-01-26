package com.ekkod.web.dao;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ekkod.web.model.Kullanici;
import com.ekkod.web.hibernate.HibernateUtil;

public class KullaniciDao {

	public Kullanici getirKullanici(String _kullaniciAd) {

		Kullanici user = null;
		Session session = HibernateUtil.openSession();
		Transaction tx = null;
		try {
			tx = session.getTransaction();
			tx.begin();
			String queryString = "from Kullanici where ad LIKE CONCAT('%',?1,'%')";
			Query query = session.createQuery(queryString);
			query.setParameter(1, _kullaniciAd);
			user = (Kullanici) query.getSingleResult();
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
		return user;
	}

}
