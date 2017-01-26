package com.ekkod.web.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ekkod.web.hibernate.HibernateUtil;
import com.ekkod.web.model.GuncelBilgi;

public class GuncelBilgiDao {

	@SuppressWarnings("unchecked")
	public static List<GuncelBilgi> getirGuncelBilgiler(){
		 List<GuncelBilgi> _list =new ArrayList<GuncelBilgi>();
	        Session session = HibernateUtil.openSession();
	        Transaction tx = null;       
	        try {
	            tx = session.getTransaction();
	            tx.begin();
	            _list = session.createQuery("from GuncelBilgi").getResultList();   
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
	public List<GuncelBilgi> getirIDsonrasiGuncelBilgiler(int id){
        List<GuncelBilgi> _list =new ArrayList<GuncelBilgi>();
        Session session = HibernateUtil.openSession();
        Transaction tx = null;       
        try {
            tx = session.getTransaction();
            tx.begin();
            _list = session.createQuery("from GuncelBilgi where id >"+id).getResultList();   
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
	
	public void guncelBilgiEkle(GuncelBilgi gb){
		 Session session = HibernateUtil.openSession();
	        Transaction tx = null;       
	        try {
	            tx = session.getTransaction();
	            tx.begin();
	            session.save(gb);
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
	
	public void guncelBilgiGuncelle(GuncelBilgi gb){
		 Session session = HibernateUtil.openSession();
	        Transaction tx = null;       
	        try {
	            tx = session.getTransaction();
	            tx.begin();
	            session.update(gb);
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
	
	public void guncelBilgiSil(GuncelBilgi gb){
		 Session session = HibernateUtil.openSession();
	        Transaction tx = null;       
	        try {
	            tx = session.getTransaction();
	            tx.begin();
	            session.delete(gb);
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
