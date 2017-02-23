package quizapp.bean;

public class StudentLogin {
    private String fName,lName,email;
    private int studentID;
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

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
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
