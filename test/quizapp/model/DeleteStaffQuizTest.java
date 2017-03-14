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
public class DeleteStaffQuizTest {
    
    public DeleteStaffQuizTest() {
    }

    /**
     * Test of delete method, of class DeleteStaffQuiz.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int quizID = 42;
        DeleteStaffQuiz instance = new DeleteStaffQuiz();
        boolean expResult = true;
        boolean result = instance.delete(quizID);
        assertEquals(expResult, result);
    }

    /**
     * Test of changeAvailability method, of class DeleteStaffQuiz.
     */
    @Test
    public void testChangeAvailability() {
        System.out.println("changeAvailability");
        int quizID = 43;
        DeleteStaffQuiz instance = new DeleteStaffQuiz();
        boolean expResult = true;
        boolean result = instance.changeAvailability(quizID);
        assertEquals(expResult, result);
    }
    
}
