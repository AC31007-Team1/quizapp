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
public class CreatePinnedTest {
    
    public CreatePinnedTest() {
    }

    /**
     * Test of checkPinned method, of class CreatePinned.
     */
    @Test
    public void testCheckPinned() {
        System.out.println("checkPinned");
        String qi = "1";
        int si = 1234;
        CreatePinned instance = new CreatePinned();
        boolean expResult = true;
        boolean result = instance.checkPinned(qi, si);
        assertEquals(expResult, result);
    }
}
