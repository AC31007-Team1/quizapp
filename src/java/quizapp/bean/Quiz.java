package quizapp.bean;

import java.util.ArrayList;
import java.util.List;

public class Quiz {
    
    private List quizList = new ArrayList();
    private List quizIDList = new ArrayList();

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
