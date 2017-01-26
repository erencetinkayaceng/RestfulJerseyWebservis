package com.ekkod.web.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


 
public class HibernateUtil {
 
    private static SessionFactory sessionFactory;
 
    static {
        try {
        	if (sessionFactory == null) {
            Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
                    
        // builds a session factory from the service registry
        sessionFactory = configuration.buildSessionFactory();  
        	}
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
 
    public static Session openSession() {
        return sessionFactory.openSession();
    }
}
