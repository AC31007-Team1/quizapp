/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author iain
 */
@WebServlet(name = "QuizStatistics", urlPatterns = {"/QuizStatistics", "/QuizStatistics/"})
public class ProceedToQuizStart extends HttpServlet{
    
    
     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("addQuizQuestions.jsp");
            rd.forward(request,response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String quizID = request.getParameter("quiz");
        
        HttpSession session = request.getSession();
        
        Quiz quiz = new Quiz();
        
        quiz.setQuizID(quizID);
        
        session.setAttribute("Quiz", quiz);
        session.setAttribute("QuizID", quiz.getQuizID());
        
        RequestDispatcher rd = request.getRequestDispatcher("addQuizQuestions.jsp");
            rd.forward(request,response);
    }
}
