/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import quizapp.bean.QuestionContainer;
import quizapp.model.CreateQuiz;

/**
 *
 * @author iain
 */
@WebServlet(name = "previewQuiz", urlPatterns = {"/previewQuiz", "/previewQuiz/"})
public class previewQuiz extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("previewQuiz.jsp");
        rd.forward(request, response);
        
        
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int quizQuestionID = Integer.parseInt(request.getParameter("quizquestionid"));
        String quizQuestion = request.getParameter("quizquestion");
        String quizQuestionAnswer = request.getParameter("quizquestionanswer");
        String quizQuestionExplanation = request.getParameter("quizExplanation");
        String quizQuestionVideoUrl = request.getParameter("quizVideoUrl");
        String appendedVideoUrl=""; 
        if (quizQuestionVideoUrl!=null && !quizQuestionVideoUrl.isEmpty())
        {
            appendedVideoUrl = "https://www.youtube.com/watch?v=" + quizQuestionVideoUrl;
        }
        List quizQuestionIncorrect = new ArrayList();
        for (int i=1;i<4;i++)
        {
            quizQuestionIncorrect.add(request.getParameter("quizquestionincorrect"+i));
        }
        HttpSession session = request.getSession();
        QuestionContainer questionContainer = new QuestionContainer();
        questionContainer.setQuestionID(quizQuestionID);
        questionContainer.setQuestion(quizQuestion);
        questionContainer.setCorrect(quizQuestionAnswer);
        questionContainer.setIncorrect(quizQuestionIncorrect);
        questionContainer.setExplanation(quizQuestionExplanation);
        questionContainer.setVideoUrl(appendedVideoUrl);
        session.setAttribute("QuestionContainer", questionContainer);
        response.sendRedirect("/2016-agileteam1/editQuizQuestion");
        
    }
}
