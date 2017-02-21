package quizapp.bean;

public class Profile {
    private String staffID,fName,lName,email;
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

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
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
