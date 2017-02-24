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
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import quizapp.model.AddAccount;

/**
 *
 * @author craigwatt
 */
@WebServlet(name = "CreateAccount", urlPatterns = {"/CreateAccount"})

@MultipartConfig
public class CreateAccount extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("createAccount.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String fName = request.getParameter("firstname");
        String lName = request.getParameter("lastname");
        String uEmail = request.getParameter("email");
        String uSoul = request.getParameter("soulChoice");
        

        switch (uSoul) {
            //staff
            case "0":
                String staffID = request.getParameter("staffID");
                //AccountCreationData acdStaff = new AccountCreationData();
                //acdStaff.setStaffData(uName, uEmail);
                AddAccount staffRegModel = new AddAccount();
                if (staffRegModel.insertStaffAccount(staffID, fName, lName, uEmail)) {
                    response.sendRedirect("/2016-agileteam1/CreateAccountSuccess");
                    break;
                }
                else{
                    response.sendRedirect("/2016-agileteam1/CreateAccountError");
                    break;
                }
            //student
            case "1":
                int sMatric = Integer.parseInt(request.getParameter("matric"));
                //AccountCreationData acdStudent = new AccountCreationData();
                //acdStudent.setStudentData(uName, uEmail, sMatric);
                AddAccount studentRegModel = new AddAccount();
                if (studentRegModel.insertStudentAccount()) {
                    response.sendRedirect("/2016-agileteam1/CreateAccountSuccess");
                }   break;
            default:
                response.sendRedirect("/2016-agileteam1/CreateAccountError");
                break;
        }
    }

    @Override
    public String getServletInfo() {
        return "doGet (request forward to create Account JSP page.  doPost ()";
    }// </editor-fold>
}
