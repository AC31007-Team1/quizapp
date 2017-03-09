/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import quizapp.bean.QuestionContainer;
import quizapp.bean.StaffLogin;
import quizapp.model.CreateQuiz;
import quizapp.model.EditQuizQuestion;

/**
 *
 * @author Iain
 */
@WebServlet(name = "editQuizQuestion", urlPatterns = {"/editQuizQuestion", "/editQuizQuestion/"})
public class editQuizQuestion extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("editQuizQuestion.jsp");
        rd.forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String[] incorrectAnswers = new String[3];
        String correctAnswer = request.getParameter("cAnswer");
        String question = request.getParameter("question");
        for (int i=0;i<3;i++)
        {
            int a=i+1;
            incorrectAnswers[i] = request.getParameter("answeri"+a);
        }
        HttpSession session = request.getSession();
        QuestionContainer questionContainer = (QuestionContainer) session.getAttribute("QuestionContainer");
        EditQuizQuestion editQuizQuestion = new EditQuizQuestion();
        try {
            editQuizQuestion.updateQuizQuestions(question,questionContainer.getQuestionID());
        } catch (SQLException ex) {
            Logger.getLogger(editQuizQuestion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(editQuizQuestion.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            editQuizQuestion.updateQuizAnswers(correctAnswer, incorrectAnswers[0], incorrectAnswers[1], incorrectAnswers[2], questionContainer.getQuestionID());
        } catch (SQLException ex) {
            Logger.getLogger(editQuizQuestion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(editQuizQuestion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        response.sendRedirect("/2016-agileteam1/ViewQuizzes");
    } 
}
