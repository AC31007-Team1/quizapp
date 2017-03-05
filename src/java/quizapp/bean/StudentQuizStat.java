/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp.bean;

import java.time.Instant;

/**
 *
 * @author craigwatt
 */
public class StudentQuizStat {

    private int qid;

    private String qn;

    private int qs;

    private Instant dt;

    public StudentQuizStat(int qid, String qn, int qs, Instant dt) {
        this.qid = qid;
        this.qn = qn;
        this.qs = qs;
        this.dt = dt;
    }

    public int getQid() {
        return this.qid;
    }

    public String getQn() {
        return this.qn;
    }

    public int getQs() {
        return this.qs;
    }

    public Instant getDt() {
        return this.dt;
    }
}
