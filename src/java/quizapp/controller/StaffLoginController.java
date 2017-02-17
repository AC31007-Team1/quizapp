package quizapp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import quizapp.bean.StaffLogin;
import quizapp.model.StaffMember;


@WebServlet(name = "StaffLogin", urlPatterns = {"/StaffLogin"})
public class StaffLoginController extends HttpServlet {

    
    @Override  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
                RequestDispatcher rd=request.getRequestDispatcher("stafflogin.jsp");  
                rd.forward(request, response); 
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { 
          
        String staffID=request.getParameter("staffID");
        
        StaffLogin staffLogin = new StaffLogin();
        StaffMember staffMember = new StaffMember();
        
        staffLogin.setStaffID(staffID);
        
        boolean isStaff = staffMember.isValidStaff(staffID);  
          
        if(isStaff){
            staffLogin.setLoggedIn(isStaff);
            RequestDispatcher rd=request.getRequestDispatcher("login-success.jsp");  
            rd.forward(request, response);  
        }  
        else{
            staffLogin.setLoggedIn(isStaff);
            RequestDispatcher rd=request.getRequestDispatcher("login-error.jsp");  
            rd.forward(request, response);  
        }
    }
    
    

}
