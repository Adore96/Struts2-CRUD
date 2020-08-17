/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Adore96.action;

import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;
import org.jboss.weld.event.Status;

/**
 *
 * @author kasun_k
 */
public class ActionCheck {
    
    private String name;
    private String CheckValue;

 
    
    public String execute(){
        
        System.out.println(CheckValue);
        return "success";
    }

    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//////////////////////////////////////////// Getters and Setters /////////////////////////////////////////////////////////
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
        public String getCheckValue() {
        return CheckValue;
    }

    public void setCheckValue(String CheckValue) {
        this.CheckValue = CheckValue;
    }
    
}
