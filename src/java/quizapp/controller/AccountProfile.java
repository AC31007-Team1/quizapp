/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import quizapp.bean.StaffLogin;
import quizapp.model.StaffMember;

/**
 *
 * @author craigwatt
 */
@WebServlet(name = "AccountProfile", urlPatterns = {"/AccountProfile"})
public class AccountProfile extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        StaffLogin staffLogin = (StaffLogin) session.getAttribute("StaffLogin");
        
        gatherProfile(staffLogin.getStaffID(),request,response);
    }

    private void gatherProfile(int staffID, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StaffMember sm = new StaffMember();
        StaffLogin slbean;
        slbean = sm.getProfile(staffID);
        request.setAttribute("profile",slbean);
        RequestDispatcher rd = request.getRequestDispatcher("/accountProfile.jsp");
        //request.setAttribute("sid", slbean.getStaffID());
        //request.setAttribute("pid", slbean.getProfileID());
        //request.setAttribute("fn", slbean.getfName());
        //request.setAttribute("ln", slbean.getlName());
        //request.setAttribute("em", slbean.getEmail());
        //request.setAttribute("soul", slbean.getSoul());
        
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("/2016-agileteam1");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
