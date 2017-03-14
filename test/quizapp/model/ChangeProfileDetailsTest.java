/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author iain
 */
public class ChangeProfileDetailsTest {
    
    public ChangeProfileDetailsTest() {
    }

    /**
     * Test of editStaffProfile method, of class ChangeProfileDetails.
     */
    @Test
    public void testEditStaffProfile() {
        System.out.println("editStaffProfile");
        String firstN = "Craig";
        String lastN = "Watt";
        String email = "craigwattstaff@dundee.ac.uk";
        int staffID = 500;
        ChangeProfileDetails instance = new ChangeProfileDetails();
        boolean expResult = true;
        boolean result = instance.editStaffProfile(firstN, lastN, email, staffID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of editStudentProfile method, of class ChangeProfileDetails.
     */
    @Test
    public void testEditStudentProfile() {
        System.out.println("editStudentProfile");
        String firstN = "Chris";
        String lastN = "Sutherland";
        String email = "ChrisSutherlandStudent@dundee.ac.uk";
        int matricN = 1234;
        ChangeProfileDetails instance = new ChangeProfileDetails();
        boolean expResult = true;
        boolean result = instance.editStudentProfile(firstN, lastN, email, matricN);
        assertEquals(expResult, result);
    }
    
}
