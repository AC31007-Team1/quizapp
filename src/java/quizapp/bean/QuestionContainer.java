/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp.bean;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iain
 */
public class QuestionContainer {
    private List incorrect = new ArrayList();
    private String correct;
    private String question;
    private int questionID;

    public List getIncorrect() {
        return incorrect;
    }

    public void setIncorrect(List incorrect) {
        this.incorrect = incorrect;
    }

    public String getCorrect() {
        return correct;
    }

    public void setCorrect(String correct) {
        this.correct = correct;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getQuestionID() {
        return questionID;
    }

    public void setQuestionID(int questionID) {
        this.questionID = questionID;
    }
    
    
}
