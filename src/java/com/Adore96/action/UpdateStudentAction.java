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
public class UpdateStudentAction {

    public String UpdateStudent() {

        System.out.println("doGet in edit servlet");

//        StudentDAO studentdao = ;
        StudentInfo studentInfo = new StudentInfo();

        HttpServletRequest request = ServletActionContext.getRequest();

        String username = request.getParameter("username");

        System.out.println("EditStudent Servlet id : " + username);

        studentInfo.setUsername(username);

        StudentInfo studentInfo1 = new StudentDAO().ShowEditTable(studentInfo);

        if (studentInfo1 == null) {
            System.out.println("Student info is empty.");
            return "emptyObject";
        } else {
            request.setAttribute("studentInfo1", studentInfo1);
            return "showtabledata";
        }

    }
}
