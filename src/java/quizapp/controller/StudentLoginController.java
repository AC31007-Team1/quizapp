package quizapp.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import quizapp.bean.Student;
import quizapp.bean.UserLogin;
import quizapp.bean.modulecount;
import quizapp.model.FetchModules;
import quizapp.model.StudentMember;

@WebServlet(name = "StudentLogin", urlPatterns = {"/StudentLogin"})
public class StudentLoginController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("studentlogin.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String sss = request.getParameter("studentID");
        int studentID = Integer.parseInt(sss);
        StudentMember studentMember = new StudentMember();

        boolean isStudent = studentMember.isValidStudent(studentID);
        HttpSession session = request.getSession();

        if (isStudent) {
            Student student = new Student(studentID);

            student.setLoggedIn();
            //VV now not required
            //student.setMatricN(studentID);

            session.setAttribute("StudentLogin", student);
            //craig's who code
            UserLogin userLogin = new Student(studentID);
            //WhoLoggedIn wli=new StudentWhoLog();
            session.setAttribute("whoLog", userLogin);
            modulecount modfinder = new modulecount();
            FetchModules fetchmod = new FetchModules();
            modfinder.setSize(fetchmod.returnModuleCount());
            for (int i = 0; i <= modfinder.getSize(); i++) {
                modfinder.setModule(fetchmod.returnModules(i), i);
            }
            session.setAttribute("modulecount", modfinder);
            RequestDispatcher rd = request.getRequestDispatcher("login-success.jsp");
            rd.forward(request, response);
        } else {
            RequestDispatcher rd = request.getRequestDispatcher("login-error.jsp");
            rd.forward(request, response);
        }
    }

}
