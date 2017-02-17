package quizapp.bean;

public class StaffLogin {
    private String staffID,password;  
  
    public String getName() {  
        return staffID;  
    }  
    public void setName(String staffID) {  
        this.staffID = staffID;  
    }  
    public String getPassword() {  
        return password;  
    }  
    public void setPassword(String password) {  
        this.password = password;  
    }  
    public boolean validate(){  
        if(password.equals("admin")){
            return true;  
        }  
        else{  
            return false;  
        }  
    }  
}
