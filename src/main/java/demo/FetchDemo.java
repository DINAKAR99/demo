package demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
    public static void main(String[] args) throws IOException {
            SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

            Session openSession = sessionFactory.openSession();

            // Student student = openSession.get(Student.class,1);
            Address student = openSession.get(Address.class,1);
            // Student student = openSession.getReference(Student.class,1);

            byte[] a=student.getImage();
            FileOutputStream fileOutputStream = new FileOutputStream("src/main/java/trad-2.jpg");
            fileOutputStream.write(a);
fileOutputStream.close();
            // System.out.println();



    }
    
}
