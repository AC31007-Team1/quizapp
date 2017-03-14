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
public class FetchModulesTest {
    
    public FetchModulesTest() {
    }

    /**
     * Test of returnModules method, of class FetchModules.
     */
    @Test
    public void testReturnModules() {
        System.out.println("returnModules");
        int module_id = 0;
        FetchModules instance = new FetchModules();
        String expResult = "AC31007 - Agile Sofware Engineering";
        String result = instance.returnModules(module_id);
        assertEquals(expResult, result);
    }

    /**
     * Test of returnModuleCount method, of class FetchModules.
     */
    @Test
    public void testReturnModuleCount() {
        System.out.println("returnModuleCount");
        FetchModules instance = new FetchModules();
        int expResult = 3;
        int result = instance.returnModuleCount();
        assertEquals(expResult, result);
    }
    
}
