package quizapp.bean;

public class StudentLogin {
    private String studentID,fName,lName,email;
    private boolean loggedIn = false;
    
    public void setLoginState(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    public void setLoggedIn() {
        this.loggedIn = true;
    }
    
    public boolean getLoggedIn() {
        return loggedIn;
    }
    
    public void setLoggedOut() {
        this.loggedIn = false;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
