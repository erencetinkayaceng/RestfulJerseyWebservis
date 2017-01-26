package com.ekkod.web.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ekkod.web.hibernate.HibernateUtil;
import com.ekkod.web.model.Test;

public class TestDao {
	@SuppressWarnings("unchecked")
	public static List<Test> getirTestler(){
		 List<Test> _list =new ArrayList<Test>();
	        Session session = HibernateUtil.openSession();
	        Transaction tx = null;       
	        try {
	            tx = session.getTransaction();
	            tx.begin();
	            _list = session.createQuery("from Test").getResultList();   
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
	public List<Test> getirIDsonrasiTestler(int id){
        List<Test> _list =new ArrayList<Test>();
        Session session = HibernateUtil.openSession();
        Transaction tx = null;       
        try {
            tx = session.getTransaction();
            tx.begin();
            _list = session.createQuery("from Test where id >"+id).getResultList();           
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

	
	public void testEkle(Test test){
		 Session session = HibernateUtil.openSession();
	        Transaction tx = null;       
	        try {
	            tx = session.getTransaction();
	            tx.begin();
	            session.save(test);
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
	
	public void testGuncelle(Test test){
		 Session session = HibernateUtil.openSession();
	        Transaction tx = null;       
	        try {
	            tx = session.getTransaction();
	            tx.begin();
	            session.update(test);
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
	
	public void testSil(Test test){
		 Session session = HibernateUtil.openSession();
	        Transaction tx = null;       
	        try {
	            tx = session.getTransaction();
	            tx.begin();
	            session.delete(test);
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
