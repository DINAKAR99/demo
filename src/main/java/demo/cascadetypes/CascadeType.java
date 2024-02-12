package demo.cascadetypes;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import demo.Map.Answers;
import demo.Map.Question;

public class CascadeType {

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session openSession = sessionFactory.openSession();
        Question q1 = new Question();
        q1.setQuestion("what is a pigeon");
        q1.setQuestionId(1002);

        Answers answers = new Answers();
        answers.setAnswer("bird");
        answers.setAnswerId(2004);
        Answers answers1 = new Answers();
        answers1.setAnswer("white bird");
        answers1.setAnswerId(2005);
        Answers answers2 = new Answers();
        answers2.setAnswer("black bird");
        answers2.setAnswerId(2006);

        List<Answers> answerss = new ArrayList<Answers>();
        answerss.add(answers);
        answerss.add(answers1);
        answerss.add(answers2);

        q1.setAnswers(answerss);

        answers1.setQuestion(q1);
        answers2.setQuestion(q1);
        answers.setQuestion(q1);

        Transaction beginTransaction = openSession.beginTransaction();

        openSession.persist(q1);

        beginTransaction.commit();
        openSession.close();

        sessionFactory.close();
    }

}
