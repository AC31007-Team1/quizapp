/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import quizapp.bean.Quiz;
import quizapp.bean.StaffLogin;
import quizapp.model.FetchStaffQuizzes;
import quizapp.model.StaffMember;

/**
 *
 * @author craigwatt
 */
@WebServlet(name = "ViewStaffQuizzes", urlPatterns = {"/ViewStaffQuizzes"})
public class ViewStaffQuizzes extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                HttpSession session = request.getSession();
        StaffLogin staffLogin = (StaffLogin) session.getAttribute("StaffLogin");
        gatherStaffQuizzes(staffLogin.getStaffID(),request,response);
    }
    
    private void gatherStaffQuizzes(int sID, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        FetchStaffQuizzes sO = new FetchStaffQuizzes();
        Quiz qBean;
        qBean = sO.getQuizzes(sID);
        request.setAttribute("quizBean",qBean);
        RequestDispatcher rd = request.getRequestDispatcher("/viewStaffQuizzes.jsp");
        rd.forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
