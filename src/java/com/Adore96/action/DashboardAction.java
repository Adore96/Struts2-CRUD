/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Adore96.action;

import com.Adore96.dao.StudentDAO;
import com.Adore96.model.StudentInfo;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 *
 * @author kasun_k
 */
public class DashboardAction extends ActionSupport{
    
    private String username;
    
    
    
    public String DeleteUser(){
        System.out.println(getUsername());
        
        return "success";
    }

    public String ListUser() {
        System.out.println("Listuser method called in Dashboard action.");
//        StudentDAO studentDAO = new StudentDAO();
        HttpServletRequest request = ServletActionContext.getRequest();

        List<StudentInfo> listUser = new StudentDAO().ShowTable();
        HttpSession session = request.getSession(false);

//        list user error
        if (listUser.isEmpty()) {
            System.out.println("List user is empty.");
            return "emptylist";
        } else {
            request.setAttribute("listUser", listUser);
            return "showtabledata";
        }

    }
    
    public String execute(){
        
        
        return "success";
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }
}
