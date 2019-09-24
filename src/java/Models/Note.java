/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.io.Serializable;

/**
 *
 * @author 797462
 */
public class Note implements Serializable 
{   
    private String title;
    private String context;

    public Note() 
    {
        
    }
    
    public String getTitle() 
    {
        return title;
    }

    public String getContext() 
    {
        return context;
    }

    public void setTitle(String title) 
    {
        this.title = title;
    }

    public void setContext(String context)
    {
        this.context = context;
    }
 
}
