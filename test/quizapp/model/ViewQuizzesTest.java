package quizapp.model;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class ViewQuizzesTest {

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
    
    @Test
    public void testGetStaffQuizzesID() {
        
        boolean comparisonResult = false;
        boolean expectedResultResult = false;
        
        List<Integer> comparison = new ArrayList<Integer>();
        
        comparison.add(39);
        comparison.add(40);
        
        ViewQuizzes vq = new ViewQuizzes();
        
        List expectedResult = vq.getStaffQuizzesID(1);
        
        if(comparison.containsAll(comparison)) {
            comparisonResult = true;
        }
        
        if(expectedResult.containsAll(comparison)) {
            expectedResultResult = true;
        }
        
        Assert.assertEquals(comparisonResult,expectedResultResult);
    }

    @Test
    public void testGetStuQuizzes() {
        
        boolean comparisonResult = false;
        boolean expectedResultResult = false;
        
        List<String> comparison = new ArrayList<String>();
        
        comparison.add("Tony's Quiz For Agile");
        comparison.add("Anthony's Example Quiz");
        
        ViewQuizzes vq = new ViewQuizzes();
        
        List expectedResult = vq.getStuQuizzes(1);
        
        if(comparison.containsAll(comparison)) {
            comparisonResult = true;
        }
        
        if(expectedResult.containsAll(comparison)) {
            expectedResultResult = true;
        }
        
        Assert.assertEquals(comparisonResult,expectedResultResult);
    }

    @Test
    public void testGetStuQuizzesID() {
        
        boolean comparisonResult = false;
        boolean expectedResultResult = false;
        
        List<Integer> comparison = new ArrayList<Integer>();
        
        comparison.add(39);
        comparison.add(40);
        
        ViewQuizzes vq = new ViewQuizzes();
        
        List expectedResult = vq.getStuQuizzesID(1);
        
        if(comparison.containsAll(comparison)) {
            comparisonResult = true;
        }
        
        if(expectedResult.containsAll(comparison)) {
            expectedResultResult = true;
        }
        
        Assert.assertEquals(comparisonResult,expectedResultResult);
    } 
}
