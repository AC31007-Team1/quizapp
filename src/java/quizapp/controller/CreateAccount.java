package quizapp.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import quizapp.model.AddAccount;

@WebServlet(name = "CreateAccount", urlPatterns = {"/CreateAccount"})
public class CreateAccount extends HttpServlet {
    
    AddAccount addAccount = new AddAccount();


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
                
                if (addAccount.insertStaffAccount(staffID, fName, lName, uEmail)) {
                    response.sendRedirect("/2016-agileteam1/CreateAccountSuccess");
                    break;
                } else {
                    response.sendRedirect("/2016-agileteam1/CreateAccountError");
                    break;
                }
                
            //student
            case "1":
                String sMatric = request.getParameter("matric");
                
                if (addAccount.insertStudentAccount(sMatric, fName, lName, uEmail)) {
                    response.sendRedirect("/2016-agileteam1/CreateAccountSuccess");
                    break;
                } else {
                    response.sendRedirect("/2016-agileteam1/CreateAccountError");
                    break;
                }
                
            default:
                response.sendRedirect("/2016-agileteam1/CreateAccountError");
                break;
        }
    }
}
