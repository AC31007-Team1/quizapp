/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp.bean;

import java.util.Vector;

/**
 *
 * @author Iain
 */
public class modulecount {
   int size;
   Vector module;
   
   modulecount()
   {
       module = new Vector();
   }
    public String getModule(int id)
    {
        return module.get(id).toString();
    }
    
    public void setModule(String indvmodule, int id)
    {
        module.add(id,indvmodule);
    }
    
    public int getSize()
    {
        return size;
    }
    
    public void setSize(int size)
    {
        this.size=size;
    }
    
    
}
