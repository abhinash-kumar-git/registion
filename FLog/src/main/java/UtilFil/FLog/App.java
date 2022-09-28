package UtilFil.FLog;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import www.com.pojo.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Configuration cfg=new Configuration();
        cfg.configure("hibernte.cfg.xml");
        SessionFactory fact=cfg.buildSessionFactory();
        Student st=new Student();
       //wee
        st.setName("abhinash");
        st.setCity("mohali");
        Session ses=fact.openSession();
     Transaction tx=    ses.beginTransaction();
        ses.save(st);
        tx.commit();
        
        ses.close();
    }
}
