/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author craigwatt
 */
public class AddAccountTest {
    
    public AddAccountTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of insertStaffAccount method, of class AddAccount.
     */
    @Test
    public void testInsertStaffAccount() {
        System.out.println("insertStaffAccount");
        String staffID = "";
        String staffFN = "";
        String staffLN = "";
        String staffE = "";
        AddAccount instance = new AddAccount();
        boolean expResult = false;
        boolean result = instance.insertStaffAccount(staffID, staffFN, staffLN, staffE);
        assertEquals(expResult, result);
    }

    /**
     * Test of insertStudentAccount method, of class AddAccount.
     */
    @Test
    public void testInsertStudentAccount() {
        System.out.println("insertStudentAccount");
        String matricN = "";
        String studentFN = "";
        String studentLN = "";
        String studentE = "";
        AddAccount instance = new AddAccount();
        boolean expResult = true;
        boolean result = instance.insertStudentAccount(matricN, studentFN, studentLN, studentE);
        assertEquals(expResult, result);
    }
    
}
