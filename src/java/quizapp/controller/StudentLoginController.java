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
import quizapp.bean.StudentLogin;
import quizapp.bean.modulecount;
import quizapp.model.FetchModules;
import quizapp.model.StudentMember;

@WebServlet(name = "StudentLogin", urlPatterns = {"/StudentLogin"})
public class StudentLoginController extends HttpServlet {


    @Override  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
                RequestDispatcher rd=request.getRequestDispatcher("studentlogin.jsp");  
                rd.forward(request, response); 
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { 
          
        String studentID=request.getParameter("studentID");
        String fName=request.getParameter("fName");
        StudentMember studentMember = new StudentMember();
        
        boolean isStudent = studentMember.isValidStudent(studentID);
        HttpSession session = request.getSession();
          
        if(isStudent){
            StudentLogin studentLogin = new StudentLogin();
            studentLogin.setLoggedIn();
            studentLogin.setStudentID(studentID);
            studentLogin.getfName();
            
            session.setAttribute("StudentLogin", studentLogin);
            modulecount modfinder = new modulecount();
            FetchModules fetchmod = new FetchModules();
            modfinder.setSize(fetchmod.returnModuleCount());
            for (int i=1;i<=modfinder.getSize();i++)
            {
                    modfinder.setModule(fetchmod.returnModules(i),i);
            }
            session.setAttribute("modulecount", modfinder);
            RequestDispatcher rd=request.getRequestDispatcher("login-success.jsp");  
            rd.forward(request, response);  
        }  
        else{
            RequestDispatcher rd=request.getRequestDispatcher("login-error.jsp");  
            rd.forward(request, response);  
        }
    }
    
    

}

