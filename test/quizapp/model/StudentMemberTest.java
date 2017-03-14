/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp.model;

import org.junit.Test;
import static org.junit.Assert.*;
import quizapp.bean.UserLogin;

/**
 *
 * @author iain
 */
public class StudentMemberTest {
    
    public StudentMemberTest() {
    }

    /**
     * Test of getProfile method, of class StudentMember.
     */
    @Test
    public void testGetProfile() {
        System.out.println("getProfile");
        int matricN = 1234;
        StudentMember instance = new StudentMember();
        UserLogin result = instance.getProfile(matricN);
        assertNotNull(result);
    }

    /**
     * Test of isValid method, of class StudentMember.
     */
    @Test
    public void testIsValid() {
        System.out.println("isValid");
        int studentID = 1234;
        StudentMember instance = new StudentMember();
        boolean result = instance.isValid(studentID);
        assertNotNull(result);
    }

    /**
     * Test of changeProfile method, of class StudentMember.
     */
    @Test
    public void testChangeProfile() {
        System.out.println("changeProfile");
        String firstN = "Jim";
        String lastN = "Smith";
        String email = "JimSmithStudent@dundee.ac.uk";
        int matricN = 1234;
        StudentMember instance = new StudentMember();
        boolean result = instance.changeProfile(firstN, lastN, email, matricN);
        assertNotNull(result);
    }
    
}
