/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Adore96.action;



/**
 *
 * @author kasun_k
 */
public class LoginAction {
    private String username;
    private String password;


    
    public String execute(){
        System.out.println("Hello from LoginAction Java.");
        System.out.println("Username is : "+getUsername());
        System.out.println("Password is : "+getPassword());
        return "success";
    }
    
    public void Login(){
        System.out.println("sout from login method.");
    }
    
    
    
    
    
    
    //////////////////////////////////////////////////////Getters and Setters///////////////////////////////////
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
