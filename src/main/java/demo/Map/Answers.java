package demo.Map;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Answers {

    public Answers(int answerId, String answer, demo.Map.Question question) {
        this.answerId = answerId;
        this.answer = answer;
        Question = question;
    }

    @Override
    public String toString() {
        return "Answers is  =" + answer;
    }

    public Answers() {
    }

    @Id

    private int answerId;
    private String answer;
    @ManyToOne
    @JoinColumn(name = "q_id")

    private Question Question;

    public Question getQuestion() {
        return Question;
    }

    public void setQuestion(Question question) {
        Question = question;
    }

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

}
