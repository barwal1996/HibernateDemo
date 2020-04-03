package com.niit.tlc.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class BookApp 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	
    	SessionFactory sf= cfg.buildSessionFactory();
    	Session ses= sf.openSession();
    	Transaction t = ses.beginTransaction();
    	
    	Book b1 = new Book();
    	b1.setBookName("Champak");
    	b1.setAuthor("PremChand");
    	b1.setPrice(20);
        
    	ses.save(b1);
    	t.commit();
    	System.out.println("successfully saved");
    	ses.close();
    	sf.close();
    	System.out.println( "Hello World!" );
    }
}
