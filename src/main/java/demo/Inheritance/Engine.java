package demo.Inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Engine {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        Vehicle v1 = new Vehicle();
        v1.setVehicleName("vehicle 1");

        TwoWheeler t1 = new TwoWheeler();
        t1.setVehicleName("r15");
        t1.setSteeringhandle("bike steering handle");
        FourWheeler t2 = new FourWheeler();
        t2.setVehicleName("thar");
        t2.setSteeringWheel("car steering wheel");

        Session openSession = sessionFactory.openSession();
        Transaction beginTransaction = openSession.beginTransaction();
        openSession.persist(v1);
        openSession.persist(t1);
        openSession.persist(t2);
        beginTransaction.commit();

        sessionFactory.close();
    }

}
