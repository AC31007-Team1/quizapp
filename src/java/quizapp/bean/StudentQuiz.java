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
    private int percentageScore = 0;

    public int getScoreTally() {
        return scoreTally;
    }

    public void setScoreTally(int scoreTally) {
        this.scoreTally = scoreTally;
    }

    public int getQuestionTally() {
        return questionTally;
    }

    public void setQuestionTally(int questionTally) {
        this.questionTally = questionTally;
    }

    public int getPercentageScore() {
        return percentageScore;
    }

    public void setPercentageScore(int percentageScore) {
        this.percentageScore = percentageScore;
    }
    
}
