package demo.Map;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity

public class Question {

    public Question(int questionId, String question, List<Answers> answers) {
        this.questionId = questionId;
        this.question = question;
        this.answers = answers;
    }

    @Id
    @Column(name = "question_id")
    private int questionId;
    private String question;
    @OneToMany(mappedBy = "Question", cascade = CascadeType.ALL)

    private List<Answers> answers;

    public List<Answers> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answers> answers) {
        this.answers = answers;
    }

    public Question() {
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "Question  is " + question;
    }
}
