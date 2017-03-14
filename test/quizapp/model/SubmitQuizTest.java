/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author iain
 */
public class SubmitQuizTest {
    
    public SubmitQuizTest() {
    }

    /**
     * Test of enterResults method, of class SubmitQuiz.
     */
    @Test
    public void testEnterResults() {
        System.out.println("enterResults");
        SubmitQuiz instance = new SubmitQuiz(1234,"39",5);
        boolean expResult = true;
        boolean result = instance.enterResults();
        assertEquals(expResult, result);
    }
    
}
