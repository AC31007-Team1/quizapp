/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp.bean;

/**
 *
 * @author Anthony
 */
public class StudentQuiz {
    
    private int scoreTally = 0;
    private int questionTally = 0;
    private double percentageScore = 0.00;

    public int getScoreTally() {
        return scoreTally;
    }

    public void setScoreTally() {
        this.scoreTally++;
    }

    public int getQuestionTally() {
        return questionTally;
    }

    public void setQuestionTally() {
        this.questionTally++;
    }

    public double getPercentageScore() {
        return percentageScore;
    }

    public void setPercentageScore() {
        this.percentageScore = (scoreTally / questionTally);
    }
    
}
