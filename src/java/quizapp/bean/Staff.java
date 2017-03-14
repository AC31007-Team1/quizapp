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
public class Staff extends UserLogin {

    int staffID;

    public Staff(int staffID) {
        super();
        this.staffID = staffID;
    }

    public int getID() {
        return staffID;
    }
    public void setStaffID(int staffID) {
        this.staffID = staffID;
    }
    
    public void setProfile(int staffID, int profileID, String fName, String lName, String email, String soul) {
        this.staffID = staffID;
        this.profileID = profileID;
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.soul = soul;
    }
}
