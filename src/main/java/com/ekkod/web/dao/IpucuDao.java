package com.ekkod.web.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ekkod.web.hibernate.HibernateUtil;
import com.ekkod.web.model.Ipucu;

public class IpucuDao {
	
	@SuppressWarnings("unchecked")
	public static List<Ipucu> getirIpuclari(){
		 List<Ipucu> _list =new ArrayList<Ipucu>();
	        Session session = HibernateUtil.openSession();
	        Transaction tx = null;       
	        try {
	            tx = session.getTransaction();
	            tx.begin();
	            _list = session.createQuery("from Ipucu").getResultList();   
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
	public List<Ipucu> getirIDsonrasiIpuclari(int id){
        List<Ipucu> _list =new ArrayList<Ipucu>();
        Session session = HibernateUtil.openSession();
        Transaction tx = null;       
        try {
            tx = session.getTransaction();
            tx.begin();
            _list = session.createQuery("from Ipucu where id >"+id).getResultList();           
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
	
	public void ipucuEkle(Ipucu ip){
		 Session session = HibernateUtil.openSession();
	        Transaction tx = null;       
	        try {
	            tx = session.getTransaction();
	            tx.begin();
	            session.save(ip);
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
	
	public void ipucuGuncelle(Ipucu ip){
		 Session session = HibernateUtil.openSession();
	        Transaction tx = null;       
	        try {
	            tx = session.getTransaction();
	            tx.begin();
	            session.update(ip);
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
	
	public void ipucuSil(Ipucu ip){
		 Session session = HibernateUtil.openSession();
	        Transaction tx = null;       
	        try {
	            tx = session.getTransaction();
	            tx.begin();
	            session.delete(ip);
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
