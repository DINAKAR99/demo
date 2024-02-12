package demo.SQL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import demo.Student;

public class SQLEx {

    public static void SQLDefault(SessionFactory s) {
        Session session1 = s.openSession();

        NativeQuery<Student> nativeQuery = session1.createNativeQuery("select * from Student", Student.class);

        List<Student> list = nativeQuery.list();

        for (Student student : list) {
            System.out.println(student);
        }
        s.close();
    }

    public static void SQLSelectQuery(SessionFactory s) {
        Session session1 = s.openSession();
        NativeQuery<Student> nativeQuery2 = session1
                .createNativeQuery("Select id,city,course,duration,name from student where city=:n", Student.class);

        nativeQuery2.setParameter("n", "City4");
        List<Student> list2 = nativeQuery2.list();

        for (Student student : list2) {
            System.out.println(student);
        }
        s.close();

    }

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        System.out.println("----------------------");

        sessionFactory.close();
    }
}
