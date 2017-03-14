/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp.model;

import java.util.LinkedList;
import java.util.Queue;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author iain
 */
public class ViewQuizStatisticTest {
    
    public ViewQuizStatisticTest() {
    }

    /**
     * Test of getQuizzes method, of class ViewQuizStatistic.
     */
    @Test
    public void testGetQuizzes() {
        System.out.println("getQuizzes");
        int quizID = 39;
        ViewQuizStatistic instance = new ViewQuizStatistic();
        Queue<Integer> expResult= new LinkedList<Integer>();
        expResult.add(quizID);
        expResult.add(2);
        expResult.add(4);
        expResult.add(12);
        Queue result = instance.getQuizzes(quizID);
        assertEquals(expResult, result);
    }
    
}
