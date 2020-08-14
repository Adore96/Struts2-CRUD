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
    public String execute(){
        System.out.println("Execute from actioncheck");
        return "success";
    }
}
