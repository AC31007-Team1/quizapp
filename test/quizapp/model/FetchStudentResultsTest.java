/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp.model;

import java.util.LinkedList;
import org.junit.Test;
import static org.junit.Assert.*;
import quizapp.bean.StudentQuizStat;

/**
 *
 * @author iain
 */
public class FetchStudentResultsTest {
    
    public FetchStudentResultsTest() {
    }

    /**
     * Test of getStudentStats method, of class FetchStudentResults.
     */
    @Test
    public void testGetStudentStats() {
        System.out.println("getStudentStats");
        int matricN = 1234;
        FetchStudentResults instance = new FetchStudentResults();
        LinkedList<StudentQuizStat> result = instance.getStudentStats(matricN);
        assertNotNull(result.get(0));
    }
    
}
