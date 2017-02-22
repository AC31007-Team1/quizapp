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
   private int size;
   private Vector<String> module = new Vector<String>();
   
   public modulecount()
   {
       
   }
    public String getModule(int id)
    {
        return module.get(id);
    }
    
    public void setModule(String indvmodule, int id)
    {
        module.add(id,indvmodule);
    }
    
    public int getSize()
    {
        return size;
    }
    
    public void setSize(int a)
    {
        size=a;
    }
    
    
}
