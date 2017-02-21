package quizapp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import quizapp.bean.UserLogin;

@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    
    @Override  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
                RequestDispatcher rd=request.getRequestDispatcher("login.jsp");  
                rd.forward(request, response);  
    //doPost(req, resp);  
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
          
        String name=request.getParameter("name");  
        String password=request.getParameter("password");  
          
        UserLogin bean=new UserLogin(); //change here 
        bean.setName(name);  
        bean.setPassword(password);  
        request.setAttribute("bean",bean);  
          
        boolean status=bean.validate();  
          
        if(status){  
            RequestDispatcher rd=request.getRequestDispatcher("login-success.jsp");  
            rd.forward(request, response);  
        }  
        else{  
            RequestDispatcher rd=request.getRequestDispatcher("login-error.jsp");  
            rd.forward(request, response);  
        }
    }
    
    

}
