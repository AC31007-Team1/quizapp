/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp.model;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author iain
 */
public class PreviewQuizTest {
    
    public PreviewQuizTest() {
    }

    /**
     * Test of getQuizQuestions method, of class PreviewQuiz.
     */
    @Test
    public void testGetQuizQuestions() {
        System.out.println("getQuizQuestions");
        String quizID = "39";
        PreviewQuiz instance = new PreviewQuiz();
        List result = instance.getQuizQuestions(quizID);
        assertNotNull(result.get(0));
    }

    /**
     * Test of getQuizQuestionsAnswers method, of class PreviewQuiz.
     */
    @Test
    public void testGetQuizQuestionsAnswers() {
        System.out.println("getQuizQuestionsAnswers");
        String quizID = "39";
        PreviewQuiz instance = new PreviewQuiz();
        List result = instance.getQuizQuestionsAnswers(quizID);
        assertNotNull(result.get(0));
    }

    /**
     * Test of getQuizIncOne method, of class PreviewQuiz.
     */
    @Test
    public void testGetQuizIncOne() {
        System.out.println("getQuizIncOne");
        String quizID = "39";
        PreviewQuiz instance = new PreviewQuiz();
        List result = instance.getQuizIncOne(quizID);
        assertNotNull(result.get(0));
    }

    /**
     * Test of getQuizIncTwo method, of class PreviewQuiz.
     */
    @Test
    public void testGetQuizIncTwo() {
        System.out.println("getQuizIncTwo");
        String quizID = "39";
        PreviewQuiz instance = new PreviewQuiz();
        List result = instance.getQuizIncTwo(quizID);
        assertNotNull(result.get(0));
    }

    /**
     * Test of getQuizIncThree method, of class PreviewQuiz.
     */
    @Test
    public void testGetQuizIncThree() {
        System.out.println("getQuizIncThree");
        String quizID = "39";
        PreviewQuiz instance = new PreviewQuiz();
        List result = instance.getQuizIncThree(quizID);
        assertNotNull(result.get(0));
    }

    /**
     * Test of getQuestionID method, of class PreviewQuiz.
     */
    @Test
    public void testGetQuestionID() {
        System.out.println("getQuestionID");
        String quizID = "39";
        PreviewQuiz instance = new PreviewQuiz();
        List result = instance.getQuestionID(quizID);
        assertNotNull(result.get(0));
    }

    /**
     * Test of getAnswerExplanation method, of class PreviewQuiz.
     */
    @Test
    public void testGetAnswerExplanation() {
        System.out.println("getAnswerExplanation");
        String quizID = "39";
        PreviewQuiz instance = new PreviewQuiz();
        List result = instance.getAnswerExplanation(quizID);
        assertNotNull(result.get(0));
    }

    /**
     * Test of getVideoUrl method, of class PreviewQuiz.
     */
    @Test
    public void testGetVideoUrl() {
        System.out.println("getVideoUrl");
        String quizID = "39";
        PreviewQuiz instance = new PreviewQuiz();
        List result = instance.getVideoUrl(quizID);
        assertNotNull(result.get(0));
    }
    
}
