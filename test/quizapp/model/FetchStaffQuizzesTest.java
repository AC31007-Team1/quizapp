/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp.model;

import java.util.LinkedList;
import org.junit.Test;
import static org.junit.Assert.*;
import quizapp.bean.StaffQuiz;

/**
 *
 * @author iain
 */
public class FetchStaffQuizzesTest {
    
    public FetchStaffQuizzesTest() {
    }

    /**
     * Test of getQuizzes method, of class FetchStaffQuizzes.
     */
    @Test
    public void testGetQuizzes() {
        System.out.println("getQuizzes");
        int staffID = 789;
        FetchStaffQuizzes instance = new FetchStaffQuizzes();
        LinkedList<StaffQuiz> result = instance.getQuizzes(staffID);
        assertNotNull(result.get(0));
    }
    
}
