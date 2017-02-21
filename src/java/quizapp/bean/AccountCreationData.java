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
public class AccountCreationData {

    private String username;
    private String email;
    private String matricNumber;

    public void Pic() {

    }

    public boolean setStaffData(String username, String email) {
        this.username = username;
        this.email = email;
        this.matricNumber = null;
        return true;
    }

    public boolean setStudentData(String username, String email, String matricNumber) {
        this.username = username;
        this.email = email;
        this.matricNumber = matricNumber;
        return true;
    }

    public String getUserName() {
        return username;
    }

    public String getUserEmail() {
        return email;
    }

    public String getStudentMatric() {
        return matricNumber;
    }

}
