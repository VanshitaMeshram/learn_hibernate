package com.tka;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Client {
	public static void main(String[] args) {
		 Configuration cfg=new Configuration();
		 cfg.configure(); // locate hibernate.cfg.xml
		 cfg.addAnnotatedClass(Mobile.class);
		 SessionFactory factory=cfg.buildSessionFactory();
		 Session session=factory.openSession();
		// session.load(Mobile.class, 1);
	}

}
