package demo.HQL;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import demo.Student;

public class HQLexample {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        Session session2 = sessionFactory.openSession();
        // HQL SYNTAX
        // String query = "from Student as studenthistory where city= :x and name=:y";

        // Query query2 = session2.createQuery(query);

        // // by using named parametsers

        // query2.setParameter("x", "sd");
        // query2.setParameter("y", "sdwdsd");
        // System.out.println("----------------------------");

        // Query query3 = session2.createQuery("delete from Student where city=:a and
        // name=: b");
        // query3.setParameter("a", "brooklyn");
        // query3.setParameter("b", "jhon");

        // int executeUpdate = query3.executeUpdate();

        // System.out.println(executeUpdate);

        // update query
        // Query query4 = session2.createQuery("update Student set city =:c where
        // name='sdwdsd'");
        // query4.setParameter("c", "wonderland");
        // query4.executeUpdate();

        // session2.getTransaction().commit();

        // single result uniqueresult
        // multi results list()
        // List<Student> list1 = query2.list();
        // for (Student student : list1) {
        // System.out.println(student.getName());

        // }
        session2.beginTransaction();

        Query query5 = session2
                .createQuery("select q.question,q.questionId ,a.answer  from Question as q INNER JOIN q.answers as a");

        List<Object[]> resultList = query5.list();

        for (Object[] objects : resultList) {

            System.out.println(Arrays.toString(objects));

        }

        session2.close();
        sessionFactory.close();
    }
}
