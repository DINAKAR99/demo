package demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class StudentDemo {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        Session openSession = sessionFactory.openSession();

        Transaction beginTransaction = openSession.beginTransaction();

        Query namedQuery = openSession.createNamedQuery("getNames", Student.class);
        namedQuery.setParameter("x", 7);

        List list = namedQuery.list();

        for (Object object : list) {
            System.out.println(object);
        }

        openSession.close();
        sessionFactory.close();
    }
}
