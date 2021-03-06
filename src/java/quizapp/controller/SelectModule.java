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
import quizapp.bean.Staff;
import quizapp.bean.Student;
import quizapp.bean.UserLogin;
import quizapp.bean.module;
import quizapp.model.CreateQuiz;

/**
 *
 * @author iain
 */
@WebServlet(name = "modules", urlPatterns = {"/SelectModule", "/SelectModule/"})
public class SelectModule extends HttpServlet
{
    
        @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("SelectModule.jsp");
        rd.forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            int modID = Integer.parseInt(request.getParameter("module"));
            module specificModule  = new module();
            specificModule.setModuleID(modID);
            HttpSession session = request.getSession();
            UserLogin userLogin = (UserLogin) session.getAttribute("whoLog");
            session.setAttribute("module", specificModule);
        if (userLogin.getUserType().equals("Student"))
        {
            response.sendRedirect("/2016-agileteam1/StudentQuizSelect");
        }
        else if (userLogin.getUserType().equals("Staff"))
        {
            response.sendRedirect("/2016-agileteam1/ViewQuizzes");
        }
        else
        {
            throw new IllegalStateException("No one was logged in, or both people were logged in somehow");
        }
 
    }
    
    
}
