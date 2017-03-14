package quizapp.model;

import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Arrays.asList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class ViewQuizzesTest {
    
    public ViewQuizzesTest() {
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

    @Test
    public void testGetStaffQuizzes() {
        
        boolean comparisonResult = false;
        boolean expectedResultResult = false;
        
        List<String> comparison = new ArrayList<String>();
        
        
        comparison.add("Tony's Quiz For Agile");
        comparison.add("Anthony's Example Quiz");
        
        ViewQuizzes vq = new ViewQuizzes();
        
        List expectedResult = vq.getStaffQuizzes(1);
        
        if(comparison.containsAll(comparison)) {
            comparisonResult = true;
        }
        
        if(expectedResult.containsAll(comparison)) {
            expectedResultResult = true;
        }
        
        Assert.assertEquals(comparisonResult,expectedResultResult);
    }

    @Ignore
    @Test
    public void testGetStaffQuizzesID() {
        System.out.println("getStaffQuizzesID");
        int moduleID = 0;
        ViewQuizzes instance = new ViewQuizzes();
        List expResult = null;
        List result = instance.getStaffQuizzesID(moduleID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Ignore
    @Test
    public void testGetStuQuizzes() {
        System.out.println("getStuQuizzes");
        int moduleID = 0;
        ViewQuizzes instance = new ViewQuizzes();
        List expResult = null;
        List result = instance.getStuQuizzes(moduleID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Ignore
    @Test
    public void testGetStuQuizzesID() {
        System.out.println("getStuQuizzesID");
        int moduleID = 0;
        ViewQuizzes instance = new ViewQuizzes();
        List expResult = null;
        List result = instance.getStuQuizzesID(moduleID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
