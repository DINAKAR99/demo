package demo.Map1;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Engine {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        /// creating employees

        Emp e1 = new Emp();
        e1.setEmpId(100);
        e1.setEmpName("jhon");
        Emp e2 = new Emp();
        e2.setEmpId(101);
        e2.setEmpName("rhon");

        // creting projects
        Project p1 = new Project();
        p1.setProjectId(200);
        p1.setProjectName("quiz app");
        Project p2 = new Project();
        p2.setProjectId(201);
        p2.setProjectName(" flight simulation app");

        List<Emp> pack1 = Arrays.asList(e1, e2);
        List<Project> pack2 = Arrays.asList(p1, p2);

        e1.setProjects(pack2);

        p2.setEmployees(pack1);

        /// session
        Session session2 = sessionFactory.openSession();
        session2.beginTransaction();

        session2.persist(e1);
        session2.persist(e2);
        session2.persist(p1);
        session2.persist(p2);

        session2.getTransaction().commit();

        sessionFactory.close();
    }
}
