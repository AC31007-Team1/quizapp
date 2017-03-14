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
import quizapp.bean.UserLogin;
import quizapp.model.UserMember;

/**
 *
 * @author craigwatt
 */
@WebServlet(name = "AccountProfile", urlPatterns = {"/AccountProfile"})
public class AccountProfile extends HttpServlet {

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
        RequestDispatcher rd = request.getRequestDispatcher("/accountProfile.jsp");
        rd.forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.sendRedirect("/2016-agileteam1/EditProfile");
    }

    @Override
    public String getServletInfo() {
        return "AccountProfile Servlet";
    }
}
