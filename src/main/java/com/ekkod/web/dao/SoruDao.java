package com.ekkod.web.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ekkod.web.hibernate.HibernateUtil;
import com.ekkod.web.model.Soru;

public class SoruDao {
	@SuppressWarnings("unchecked")
	public static List<Soru> getirSorular(){
		 List<Soru> _list =new ArrayList<Soru>();
	        Session session = HibernateUtil.openSession();
	        Transaction tx = null;       
	        try {
	            tx = session.getTransaction();
	            tx.begin();
	            _list = session.createQuery("from Soru").getResultList();   
	            tx.commit();
	        } catch (Exception e) {
	            if (tx != null) {
	                tx.rollback();
	            }
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
		return _list;
	}
	
	@SuppressWarnings("unchecked")
	public List<Soru> getirIDsonrasiSorular(int id){
        List<Soru> _list =new ArrayList<Soru>();
        Session session = HibernateUtil.openSession();
        Transaction tx = null;       
        try {
            tx = session.getTransaction();
            tx.begin();
            _list = session.createQuery("from Soru where id >"+id).getResultList();           
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return _list;
    }

	
	public void soruEkle(Soru soru){
		 Session session = HibernateUtil.openSession();
	        Transaction tx = null;       
	        try {
	            tx = session.getTransaction();
	            tx.begin();
	            session.save(soru);
	            tx.commit();
	        } catch (Exception e) {
	            if (tx != null) {
	                tx.rollback();
	            }
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }		
	}
	
	public void soruGuncelle(Soru soru){
		 Session session = HibernateUtil.openSession();
	        Transaction tx = null;       
	        try {
	            tx = session.getTransaction();
	            tx.begin();
	            session.update(soru);
	            tx.commit();
	        } catch (Exception e) {
	            if (tx != null) {
	                tx.rollback();
	            }
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }		
	}
	
	public void soruSil(Soru soru){
		 Session session = HibernateUtil.openSession();
	        Transaction tx = null;       
	        try {
	            tx = session.getTransaction();
	            tx.begin();
	            session.delete(soru);
	            tx.commit();
	        } catch (Exception e) {
	            if (tx != null) {
	                tx.rollback();
	            }
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }		
	}
}
