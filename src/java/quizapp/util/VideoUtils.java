/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Iain
 */
public class VideoUtils {
    public String convertToID(String url)
    {
        String pattern = "(?<=watch\\?v=|/videos/|embed\\/)[^#\\&\\?]*";
        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher = compiledPattern.matcher(url);
        if(matcher.find()){
            return matcher.group();
        }
        else
        {
            return "";
        }
    }
}
