package com.project.walletsystem.simulation.connections;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBConnection {
	
private static DBConnection connect = new DBConnection();
	
	private DBConnection() {}
	
	public Session getConnection()
	{
		Configuration cfg = new Configuration();
		cfg.configure("com/project/walletsystem/simulation/config/hibernate.cfg.xml");
		SessionFactory bsf = cfg.buildSessionFactory();
		Session session = bsf.openSession(); 
		
		return session;
	}
	
	public static DBConnection getConnect() {
		return connect;
	}

}
