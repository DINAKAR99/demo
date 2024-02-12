package demo.States;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import demo.Student;
import demo.certificate;

public class StateDemo {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        Session session1 = sessionFactory.openSession();

        certificate s22 = new certificate();
        // transient
        ///// creating certificate
        s22.setCourse("cse");
        s22.setDuration("5 months");
        ////// creating student object
        Student s1 = new Student();
        s1.setId(10);
        s1.setName("baju");
        s1.setCity("kdc");
        s1.setC1(s22);
        ////// transact
        Transaction transaction1 = session1.beginTransaction();

        // session1.persist(s1);
        s1.setName("kali");

        Student student = session1.get(Student.class, 10);
        session1.remove(student);
        /// persistant state :session,database
        transaction1.commit();

        // closing
        session1.close();

        /// detached state so it wont go to database
        s1.setCity("ny");
        sessionFactory.close();

    }
}
