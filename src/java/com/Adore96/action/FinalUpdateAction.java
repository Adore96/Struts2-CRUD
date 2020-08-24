/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Adore96.action;

import com.Adore96.dao.StudentDAO;
import com.Adore96.model.StudentInfo;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author kasun_k
 */
public class FinalUpdateAction {

    public String FinalUpdate() {
        StudentInfo studentInfo = new StudentInfo();
        StudentDAO userDAO = new StudentDAO();
        HttpServletRequest request = ServletActionContext.getRequest();

        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String telephone = request.getParameter("telephone");

        studentInfo.setFname(fname);
        studentInfo.setLname(lname);
        studentInfo.setUsername(username);
        studentInfo.setPassword(password);
        studentInfo.setTelephone(telephone);

        if (studentInfo.UpdateStudentValidation() == 1) {
            userDAO.finalUpdate(studentInfo);
            System.out.println("update student validation passed");
        }else{
            System.out.println("update student validation failed.");
        }

        return "UpdateDone";
    }
}
