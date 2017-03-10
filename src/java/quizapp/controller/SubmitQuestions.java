package quizapp.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.http.HttpSession;
import quizapp.bean.Quiz;

import quizapp.model.AddQuizQuestions;

@WebServlet(name = "SubmitQuestions", urlPatterns = {"/SubmitQuestions", "/SubmitQuestions/"})
public class SubmitQuestions extends HttpServlet{
    public SubmitQuestions() {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        AddQuizQuestions qq = new AddQuizQuestions();

        String question = request.getParameter("question");
        String cAnswer = request.getParameter("cAnswer");
        String eAnswer = request.getParameter("eAnswer");
        String[] iAnswer = new String[3];

        // is it possible to have array here? or have '3' change to question amount
        for(int i = 1; i < 4; i++) {
            iAnswer[i-1] = request.getParameter("answeri" + i);
        }

        String quizid = (String)session.getAttribute("QuizID");

        qq.submitQuestion(question, quizid);
        qq.submitAnswers(cAnswer, iAnswer, eAnswer, quizid);


        response.sendRedirect("addQuizQuestions.jsp");
    }
}
