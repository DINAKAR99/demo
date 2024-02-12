package demo.Pagination;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import demo.Student;

public class PaginationEx {

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session1 = sessionFactory.openSession();

        String command = "from Student";

        Query<Student> query = session1.createQuery(command, Student.class);
        // implementing pagination
        query.setFirstResult(4);
        query.setMaxResults(7);
        List<Student> list = query.list();

        for (Student student : list) {
            System.out.println(student);

        }

        session1.close();
        sessionFactory.close();
    }
}
