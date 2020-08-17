/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Adore96.action;

import com.Adore96.service.ServiceCheck;
import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;
import org.jboss.weld.event.Status;

/**
 *
 * @author kasun_k
 */
public class ActionCheck {
    
    private String name;
    public String execute(){
        
        ServiceCheck servicecheck = new ServiceCheck();
        setName(servicecheck.PrintName());
        return "success";
    }

//    watch tutorial 6
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
