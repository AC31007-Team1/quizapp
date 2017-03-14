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
public class DeleteStudentPinnedTest {
    
    public DeleteStudentPinnedTest() {
    }

    /**
     * Test of deletePinned method, of class DeleteStudentPinned.
     */
    @Test
    public void testDeletePinned() {
        System.out.println("deletePinned");
        int quizID = 42;
        int studentID = 1234;
        DeleteStudentPinned instance = new DeleteStudentPinned();
        boolean expResult = true;
        boolean result = instance.deletePinned(quizID, studentID);
        assertEquals(expResult, result);
    }
    
}
