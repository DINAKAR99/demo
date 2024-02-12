package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws IOException {
        System.out.println("process started!");
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        // System.out.println(sessionFactory.isOpen());

        ////// creating student object
        Student s1 = new Student();
        s1.setId(3);
        s1.setName("din");
        s1.setCity("yorkshire");

        ///// creating address

        Address a1 = new Address();
        a1.setStreet("downing street");
        a1.setCity("yorkshire");
        a1.setOpen(true);
        a1.setAddedDate(new Date());
        a1.setX(33.0);

        try {
            FileInputStream imageData = new FileInputStream("src/main/java/trad-1.jpg");

            byte[] data = new byte[imageData.available()];

            imageData.read(data);

            a1.setImage(data);

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Session openSession = sessionFactory.openSession();
        Transaction beginTransaction = openSession.beginTransaction();
        openSession.persist(s1);
        openSession.persist(a1);
        beginTransaction.commit();
        ////////////////

        openSession.close();
        System.out.println("its done mate");
    }
}
