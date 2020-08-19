/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Adore96.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author kasun_k
 */
public class LogoutAction {
    public String Logout(){
        
        HttpServletRequest request = ServletActionContext.getRequest();
        
        HttpSession session = request.getSession(false);
        System.out.println("Session username : "+session.getAttribute("username"));
        session.invalidate();
        
        return "loggedOut";
    }
}
