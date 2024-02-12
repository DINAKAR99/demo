package demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmbedDemo {
  public static void main(String[] args) {

    SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

    certificate s22 = new certificate();
    ///// creating certificate

    s22.setCourse("cse");
    s22.setDuration("5 months");
    ////// creating student object
    Student s1 = new Student();
    s1.setId(5);
    s1.setName("raju");
    s1.setCity("nyc");
    s1.setC1(s22);

    ///// creating certificate
    certificate s23 = new certificate();

    s23.setCourse("mech");
    s23.setDuration("2 months");
    ////// creating student object
    Student s2 = new Student();
    s2.setId(9);
    s2.setName("jhon");
    s2.setCity("brooklyn");
    s2.setC1(s23);

    Session openSession = sessionFactory.openSession();
    openSession.beginTransaction();
    openSession.persist(s2);
    openSession.getTransaction().commit();

    openSession.close();
    System.out.println("dome----");

  }
}
