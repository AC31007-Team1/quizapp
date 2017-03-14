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
import quizapp.bean.Staff;
import quizapp.bean.Student;
import quizapp.bean.UserLogin;
import quizapp.model.ChangeProfileDetails;
import quizapp.model.UserMember;

/**
 *
 * @author craigwatt
 */
@WebServlet(name = "EditProfile", urlPatterns = {"/EditProfile"})
public class EditProfile extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        UserLogin userLogin = (UserLogin) session.getAttribute("whoLog");
        UserMember um = (UserMember) session.getAttribute("UserMember");
        gatherProfile(um, userLogin.getID(), request, response);
    }

    private void gatherProfile(UserMember um, int ID, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserLogin slbean;
        slbean = um.getProfile(ID);
        request.setAttribute("profile", slbean);
        RequestDispatcher rd = request.getRequestDispatcher("/editProfile.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String first_name = request.getParameter("first_name");
        String last_name = request.getParameter("last_name");
        String email = request.getParameter("email");

        UserLogin userLogin = (UserLogin) session.getAttribute("whoLog");
        UserMember um = (UserMember) session.getAttribute("UserMember");
        um.changeProfile(first_name, last_name, email, userLogin.getID());
        response.sendRedirect("/2016-agileteam1/AccountProfile");
    }

    @Override
    public String getServletInfo() {
        return "AccountProfile Servlet";
    }
}
