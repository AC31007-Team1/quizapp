/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp.util;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author iain
 */
public class VideoUtilsTest {
    
    public VideoUtilsTest() {
    }

    /**
     * Test of convertToID method, of class VideoUtils.
     */
    @Test
    public void testConvertToID() {
        System.out.println("convertToID");
        String url = "https://www.youtube.com/watch?v=RTM34fRfHRw";
        VideoUtils instance = new VideoUtils();
        String expResult = "RTM34fRfHRw";
        String result = instance.convertToID(url);
        assertEquals(expResult, result);
    }
    
}
