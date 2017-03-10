package quizapp.bean;

public class StaffLogin {
    private int staffID, profileID;
    private String fName,lName,email, soul;
    private boolean loggedIn = false;
    
    public void setProfile(int staffID, int profileID, String fName, String lName, String email, String soul){
        this.staffID=staffID;
        this.profileID=profileID;
        this.fName=fName;
        this.lName=lName;
        this.email=email;
        this.soul=soul;
        
    }
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

    public int getID() {
        return staffID;
    }

    public void setStaffID(int staffID) {
        this.staffID = staffID;
    }
    
        public int getProfileID() {
        return profileID;
    }

    public void setProfileID(int profileID) {
        this.profileID = profileID;
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
    
        public String getSoul() {
        return soul;
    }

    public void setSoul(String soul) {
        this.soul = soul;
    }
}
