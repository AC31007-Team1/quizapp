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
import quizapp.bean.Quiz;
import quizapp.bean.StudentLogin;
import quizapp.model.FetchStudentResults;

/**
 *
 * @author iain
 */
@WebServlet(name = "PrintResults", urlPatterns = {"/PrintResults"})
public class PrintResults extends HttpServlet{
     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        FetchStudentResults fsr = new FetchStudentResults();
        HttpSession session = request.getSession();
        StudentLogin studentLogin = (StudentLogin) session.getAttribute("StudentLogin");
        request.setAttribute("statList", fsr.getStudentStats(studentLogin.getID()));
        RequestDispatcher rd = request.getRequestDispatcher("PrintFriendlyPage.jsp");
        rd.forward(request,response);
    }
    
}
