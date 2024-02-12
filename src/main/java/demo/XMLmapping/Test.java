package demo.XMLmapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        Session session1 = sessionFactory.openSession();
        Transaction beginTransaction = session1.beginTransaction();

        Person p1 = new Person("raju", "ny", "999999");

        session1.persist(p1);

        beginTransaction.commit();

        session1.close();
        sessionFactory.close();
    }

}
