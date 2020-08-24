/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Adore96.action;

import com.Adore96.bean.UserInputBean;
import com.Adore96.dao.StudentDAO;
import com.Adore96.model.StudentInfo;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 *
 * @author kasun_k
 */
public class AddStudentAction extends ActionSupport implements ModelDriven<Object> {

    UserInputBean userInputBean = new UserInputBean();
    StudentInfo studentinfo = new StudentInfo();
//    StudentDAO studentdao = ;

    @Override
    public Object getModel() {
        return userInputBean; //To change body of generated methods, choose Tools | Templates.
    }

    public String AddStudent() {

        System.out.println("Add Student method called.");

        String fname = userInputBean.getFname();
        String lname = userInputBean.getLname();
        String username = userInputBean.getUsername();
        String password = userInputBean.getPassword();
        int telephone = userInputBean.getTelephone();

        studentinfo.setFname(fname);
        studentinfo.setLname(lname);
        studentinfo.setUsername(username);
        studentinfo.setPassword(password);

        if (studentinfo.AddStudentValidation() == 1) {
            String stringtelephone = Integer.toString(telephone);
            studentinfo.setTelephone(stringtelephone);

            new StudentDAO().registerStudent(studentinfo);

            return "success";
        } else {
            return "Empty Data Fields.";
        }

    }

}
