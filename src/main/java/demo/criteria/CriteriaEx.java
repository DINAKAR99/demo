package demo.criteria;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;
import org.hibernate.query.criteria.JpaCriteriaQuery;

import demo.Student;

public class CriteriaEx {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session1 = sessionFactory.openSession();

        HibernateCriteriaBuilder criteriaBuilder = session1.getCriteriaBuilder();
        // session1.createCriteria(Student.class);
        JpaCriteriaQuery<Student> query = criteriaBuilder.createQuery(Student.class);

        query.from(Student.class);

        List<Student> resultList = session1.createQuery(query).getResultList();

        for (Student student : resultList) {
            System.out.println(student);
        }

        session1.close();
        sessionFactory.close();
    }
}
