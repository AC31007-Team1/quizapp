package quizapp.bean;

public abstract class UserLogin {

    public int profileID;
    public String fName, lName, email, soul;
    public boolean loggedIn = false;

    public abstract String getUserType();

    public void setLoginState(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    public int getID() {
        return 0;
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
