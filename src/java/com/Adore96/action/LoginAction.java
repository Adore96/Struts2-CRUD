/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Adore96.action;


import com.Adore96.bean.UserInputBean;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author kasun_k
 */
public class LoginAction extends ActionSupport implements ModelDriven<Object>{
    
    UserInputBean userinputbean = new UserInputBean();

    @Override
    public Object getModel() {
        return userinputbean; //To change body of generated methods, choose Tools | Templates.
    }
    
    public String execute(){
        return "success";
    }
    
    public void Login(){
        
        HttpServletRequest request = ServletActionContext.getRequest();

        System.out.println(userinputbean.getUsername());
        System.out.println(userinputbean.getPassword());
        
        
        
        
    }
    
    
    
    
    
    
    //////////////////////////////////////////////////////Getters and Setters///////////////////////////////////
    
   
    
}
