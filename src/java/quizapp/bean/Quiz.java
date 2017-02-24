package quizapp.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class Quiz {
    private List quizList = new ArrayList();
    private List quizIDList = new ArrayList();

    private String quizID;

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
