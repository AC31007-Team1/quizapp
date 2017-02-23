/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp.controller;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import quizapp.bean.ChosenQuizStatistics;
import quizapp.bean.module;
import quizapp.model.ViewQuizStatistic;

/**
 *
 * @author iain
 */
@WebServlet(name = "QuizStatistics", urlPatterns = {"/QuizStatistics", "/QuizStatistics/"})
public class QuizStatistics extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("QuizStatistics.jsp");
        rd.forward(request, response);
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            int quizID = Integer.parseInt(request.getParameter("quiz"));
            ChosenQuizStatistics chosenQuiz = new ChosenQuizStatistics();
            ViewQuizStatistic viewQuiz = new ViewQuizStatistic();
            Queue<Integer> fillQueue = new LinkedList<Integer>();
            fillQueue= viewQuiz.getQuizzes(quizID);
            chosenQuiz.setQuiz_id(fillQueue.poll());
            chosenQuiz.setAvg_quiz_score(fillQueue.poll());
            chosenQuiz.setCumulative_quiz_attempts(fillQueue.poll());
            chosenQuiz.setCumulative_quiz_total(fillQueue.poll());
            
            HttpSession session = request.getSession();

            session.setAttribute("ChosenQuizStatistics", chosenQuiz);
        
        response.sendRedirect("/quizapp/QuizStatistics");
 
    }
    
    
}
