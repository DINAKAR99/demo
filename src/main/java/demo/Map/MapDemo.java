package demo.Map;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MapDemo {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        Session Session1 = sessionFactory.openSession();

        ///////// CReating questions
        Question q1 = new Question();
        q1.setQuestion("capital city of india");
        q1.setQuestionId(1000);

        Question q2 = new Question();
        q2.setQuestion("capital city of japan");
        q2.setQuestionId(1001);

        /////// creating answers
        Answers a1 = new Answers();
        a1.setAnswerId(2000);
        a1.setAnswer("delhi");

        Answers a2 = new Answers();
        a2.setAnswerId(2001);
        a2.setAnswer("delhi-1");
        Answers a3 = new Answers();
        a3.setAnswerId(2002);
        a3.setAnswer("tokyo");

        Answers a4 = new Answers();
        a4.setAnswerId(2003);
        a4.setAnswer("tokyo-1");

        a1.setQuestion(q1);
        a2.setQuestion(q1);
        a3.setQuestion(q2);
        a4.setQuestion(q2);

        // Transaction beginTransaction1 = Session1.beginTransaction();
        // Session1.persist(q1);
        // Session1.persist(q2);

        // Session1.persist(a1);
        // Session1.persist(a2);
        // Session1.persist(a3);
        // Session1.persist(a4);

        // beginTransaction1.commit();

        // fetcing

        Question question = Session1.get(Question.class, 1000);
        System.out.println(question);

        List<Answers> answers = question.getAnswers();

        for (Answers answers2 : answers) {
            System.out.println(answers2);

        }
        Session1.close();
        sessionFactory.close();

    }
}
