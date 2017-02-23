/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp.bean;

/**
 *
 * @author iain
 */
public class ChosenQuizStatistics {

    private int quiz_id,avg_quiz_score,cumulative_quiz_attempts,cumulative_quiz_total;

    public int getQuiz_id() {
        return quiz_id;
    }

    public void setQuiz_id(int quiz_id) {
        this.quiz_id = quiz_id;
    }

    public int getAvg_quiz_score() {
        return avg_quiz_score;
    }

    public void setAvg_quiz_score(int avg_quiz_score) {
        this.avg_quiz_score = avg_quiz_score;
    }

    public int getCumulative_quiz_attempts() {
        return cumulative_quiz_attempts;
    }

    public void setCumulative_quiz_attempts(int cumulative_quiz_attempts) {
        this.cumulative_quiz_attempts = cumulative_quiz_attempts;
    }

    public int getCumulative_quiz_total() {
        return cumulative_quiz_total;
    }

    public void setCumulative_quiz_total(int cumulative_quiz_total) {
        this.cumulative_quiz_total = cumulative_quiz_total;
    }
    
    
    
    
    
}
