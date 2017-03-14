/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp.model;

import java.util.LinkedList;
import org.junit.Test;
import static org.junit.Assert.*;
import quizapp.bean.Pinned;

/**
 *
 * @author iain
 */
public class FetchStudentPinnedTest {
    
    public FetchStudentPinnedTest() {
    }

    /**
     * Test of getQuizzes method, of class FetchStudentPinned.
     */
    @Test
    public void testGetQuizzes() {
        System.out.println("getQuizzes");
        int studentID = 1234;
        FetchStudentPinned instance = new FetchStudentPinned();
        LinkedList<Pinned> result = instance.getQuizzes(studentID);
        assertNotNull(result);
    }
    
}
