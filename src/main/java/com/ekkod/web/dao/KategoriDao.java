package com.ekkod.web.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ekkod.web.hibernate.HibernateUtil;
import com.ekkod.web.model.Kategori;

public class KategoriDao {
	@SuppressWarnings("unchecked")
	public static List<Kategori> getirKategoriler(){
		 List<Kategori> _list =new ArrayList<Kategori>();
	        Session session = HibernateUtil.openSession();
	        Transaction tx = null;       
	        try {
	            tx = session.getTransaction();
	            tx.begin();
	            _list = session.createQuery("from Kategori").getResultList();   
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
	public List<Kategori> getirIDsonrasiKategoriler(int id){
        List<Kategori> _list =new ArrayList<Kategori>();
        Session session = HibernateUtil.openSession();
        Transaction tx = null;       
        try {
            tx = session.getTransaction();
            tx.begin();
            _list = session.createQuery("from Kategori where id >"+id).getResultList();           
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
	
	public void kategoriEkle(Kategori _kategori){
		 Session session = HibernateUtil.openSession();
	        Transaction tx = null;       
	        try {
	            tx = session.getTransaction();
	            tx.begin();
	            session.save(_kategori);
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
	
	public void kategoriGuncelle(Kategori _kategori){
		 Session session = HibernateUtil.openSession();
	        Transaction tx = null;       
	        try {
	            tx = session.getTransaction();
	            tx.begin();
	            session.update(_kategori);
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
	
	public void kategoriSil(Kategori _kategori){
		 Session session = HibernateUtil.openSession();
	        Transaction tx = null;       
	        try {
	            tx = session.getTransaction();
	            tx.begin();
	            session.delete(_kategori);
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
