/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Adore96.action;

import com.Adore96.dao.StudentDAO;
import com.Adore96.model.StudentInfo;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author kasun_k
 */
public class DeleteStudentAction extends ActionSupport {

    public String DeleteStudent() {

        StudentDAO studentdao = new StudentDAO();
        StudentInfo studentInfo = new StudentInfo();

        HttpServletRequest request = ServletActionContext.getRequest();

        HttpSession session = request.getSession(false);

        String username = request.getParameter("username");
        studentInfo.setUsername(username);

        try {
            studentdao.DeleteUser(studentInfo);
            return "success";

        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.out.println("Error in delete student Servlet : " + throwables);
            return "FailtoDelete";
        }
    }
}
