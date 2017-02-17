package quizapp.bean;

public class StudentLogin {
    private String matricID,password;  
  
    public String getName() {  
        return matricID;  
    }  
    public void setName(String matricID) {  
        this.matricID = matricID;  
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
