/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp.bean;

/**
 *
 * @author craigwatt
 */
public class Student extends UserLogin {

    int matricN;

    public Student(int matricN) {
        super();
        this.matricN = matricN;
    }

    public int getID() {
        return matricN;
    }

    public void setStaffID(int staffID) {
        this.matricN = staffID;
    }

    public void setProfile(int matricN, int profileID, String fName, String lName, String email, String soul) {
        this.matricN = matricN;
        this.profileID = profileID;
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.soul = soul;
    }

    @Override
    public String getUserType() {
        return "Student";
    }
}
