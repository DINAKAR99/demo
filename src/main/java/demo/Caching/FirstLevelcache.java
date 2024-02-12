package demo.Caching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import demo.Student;

public class FirstLevelcache {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        Session openSession = sessionFactory.openSession();

        Student student = openSession.get(Student.class, 7);
        System.out.println(student);
        Student student1 = openSession.get(Student.class, 7);
        System.out.println(student1);

        // Transaction beginTransaction = openSession.beginTransaction();

        // openSession.close();
        sessionFactory.close();
    }

}
