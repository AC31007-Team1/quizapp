/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp.bean;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Iain
 */
public class module {
    int moduleid,modulecount;
    String modulename;
    module()
    {
        moduleid=this.moduleid;
        modulename=this.modulename;
    }
    public void setModuleID(int moduleid) {
        this.moduleid=moduleid;
    }
    
    public int getModuleID() {
        return moduleid;
    }
    
    public void setModuleName(String modulename) {
        this.modulename=modulename;
    }
    
    public String getModuleName() {
        return modulename;
    }
}
