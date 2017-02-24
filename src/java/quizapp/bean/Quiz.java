package quizapp.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class Quiz {
    private List quizList = new ArrayList();
    private List quizIDList = new ArrayList();

    private String quizID;
    private List quizQuestions = new ArrayList();
    private List quizCAnswers = new ArrayList();
    private List quizI1Answers = new ArrayList();
    private List quizI2Answers = new ArrayList();
    private List quizI3Answers = new ArrayList();

    public List getQuizCAnswers() {
        return quizCAnswers;
    }

    public void setQuizCAnswers(List quizCAnswers) {
        this.quizCAnswers = quizCAnswers;
    }

    public List getQuizI1Answers() {
        return quizI1Answers;
    }

    public void setQuizI1Answers(List quizI1Answers) {
        this.quizI1Answers = quizI1Answers;
    }

    public List getQuizI2Answers() {
        return quizI2Answers;
    }

    public void setQuizI2Answers(List quizI2Answers) {
        this.quizI2Answers = quizI2Answers;
    }

    public List getQuizI3Answers() {
        return quizI3Answers;
    }

    public void setQuizI3Answers(List quizI3Answers) {
        this.quizI3Answers = quizI3Answers;
    }

    public List getQuizQuestions() {
        return quizQuestions;
    }

    public void setQuizQuestions(List quizQuestions) {
        this.quizQuestions = quizQuestions;
    }

    public String getQuizID() {
        return quizID;
    }

    public void setQuizID(String quizID) {
        this.quizID = quizID;
    }

    public List getQuizList() {
        return quizList;
    }

    public void setQuizList(List quizList) {
        this.quizList = quizList;
    }

    public List getQuizIDList() {
        return quizIDList;
    }

    public void setQuizIDList(List quizIDList) {
        this.quizIDList = quizIDList;
    }
    
    
}
