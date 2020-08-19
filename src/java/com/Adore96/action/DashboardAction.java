/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Adore96.action;

import com.Adore96.dao.StudentDAO;
import com.Adore96.model.StudentInfo;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author kasun_k
 */
public class DashboardAction {

    public String ListUser() {
        System.out.println("Listuser method called in Dashboard action.");
        StudentDAO studentDAO = new StudentDAO();
        HttpServletRequest request = ServletActionContext.getRequest();

        List<StudentInfo> listUser = studentDAO.ShowTable();
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
}
