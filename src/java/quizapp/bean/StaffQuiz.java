/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp.bean;

/**
 *
 * @author craigwatt
 */
public class StaffQuiz {
    
    private int qid;

    private String qn;

    private int qa;

    public StaffQuiz(int n, String s, int c) {
        qid = n;
        qn = s;
        qa = c;
    }

    public int getQid() {
        return this.qid;
    }

    public String getQn() {
        return this.qn;
    }

    public int getQa() {
        return this.qa;
    }
}
