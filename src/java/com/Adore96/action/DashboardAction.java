/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Adore96.action;

import com.Adore96.dao.StudentDAO;
import com.Adore96.model.StudentInfo;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author kasun_k
 */
public class DashboardAction {
     StudentDAO studentDAO = new StudentDAO();
     HttpServletRequest request = ServletActionContext.getRequest();

        List<StudentInfo> listUser = studentDAO.ShowTable();
        HttpSession session = request.getSession(false);

//        list user error
        request.setAttribute("listUser", listUser);
}
