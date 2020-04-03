package com.niit.tlc.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	
    	SessionFactory sf= cfg.buildSessionFactory();
    	Session ses= sf.openSession();
    	Transaction t = ses.beginTransaction();
    	
    	Employee e1= new Employee();
    	e1.setFirstName("Amit");
    	e1.setLastName("Barwal");
    	
    	e1.setSalary(100000);
        
    	ses.save(e1);
    	t.commit();
    	System.out.println("successfully saved");
    	ses.close();
    	sf.close();
    	System.out.println( "Hello World!" );
    }
}
