/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp.model;

import org.junit.Test;
import static org.junit.Assert.*;
import quizapp.bean.Staff;
import quizapp.bean.UserLogin;

/**
 *
 * @author iain
 */
public class StaffMemberTest {
    
    public StaffMemberTest() {
    }

    /**
     * Test of getProfile method, of class StaffMember.
     */
    @Test
    public void testGetProfile() {
        System.out.println("getProfile");
        int staffID = 500;
        StaffMember instance = new StaffMember();
        UserLogin result = instance.getProfile(staffID);
        assertNotNull(result);
    }

    /**
     * Test of isValid method, of class StaffMember.
     */
    @Test
    public void testIsValid() {
        System.out.println("isValid");
        int staffID = 500;
        StaffMember instance = new StaffMember();
        boolean expResult = true;
        boolean result = instance.isValid(staffID);
        assertEquals(expResult, result);
    }

    /**
     * Test of changeProfile method, of class StaffMember.
     */
    @Test
    public void testChangeProfile() {
        System.out.println("changeProfile");
        String firstN = "Tony";
        String lastN = "Tony";
        String email = "Tony@dundeestudent.co.uk";
        int staffID = 500;
        StaffMember instance = new StaffMember();
        boolean expResult = true;
        boolean result = instance.changeProfile(firstN, lastN, email, staffID);
        assertEquals(expResult, result);
    }
    
}
