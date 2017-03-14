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
public class EditQuizQuestionTest {
    
    public EditQuizQuestionTest() {
    }

    /**
     * Test of updateQuizQuestions method, of class EditQuizQuestion.
     */
    @Test
    public void testUpdateQuizQuestions() {
        System.out.println("updateQuizQuestions");
        String question = "This question has been changed using the EditQuizQuestionTest";
        int questionID = 31;
        String videourl = "";
        EditQuizQuestion instance = new EditQuizQuestion();
        boolean expResult = true;
        boolean result = instance.updateQuizQuestions(question, questionID, videourl);
        assertEquals(expResult, result);
    }

    /**
     * Test of updateQuizAnswers method, of class EditQuizQuestion.
     */
    @Test
    public void testUpdateQuizAnswers() {
        System.out.println("updateQuizAnswers");
        String correctAnswer = "This correct answer has been changed by EditQuizQuestionTest";
        String incorrectAnswer1 = "this first incorrect answer has been changed by EditQuizQuestionTest";
        String incorrectAnswer2 = "this second incorrect answer has been changed by EditQuizQuestionTest";
        String incorrectAnswer3 = "this third incorrect answer has been changed by EditQuizQuestionTest";
        String explanation = "This explanation has been changed by EditQuizQuestionTest";
        int questionID = 31;
        EditQuizQuestion instance = new EditQuizQuestion();
        boolean expResult = true;
        boolean result = instance.updateQuizAnswers(correctAnswer, incorrectAnswer1, incorrectAnswer2, incorrectAnswer3, explanation, questionID);
        assertEquals(expResult, result);
    }
    
}
