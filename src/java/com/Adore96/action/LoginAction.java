/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
kasin asfad
 */
package com.Adore96.action;

import com.Adore96.bean.UserInputBean;
import com.Adore96.dao.StudentDAO;
import com.Adore96.model.StudentInfo;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import static java.lang.System.out;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author kasun_k
 */
public class LoginAction extends ActionSupport implements ModelDriven<Object> {

    public String execute() {
        System.out.println("Execute method");
        return "success";
    }

    UserInputBean userinputbean = new UserInputBean();
    StudentDAO studentdao = new StudentDAO();
    StudentInfo studentInfo = new StudentInfo();

    @Override
    public Object getModel() {
        return userinputbean; //To change body of generated methods, choose Tools | Templates.
    }

    public String Login() {
        System.out.println("Insert into Login Method");
        HttpServletRequest request = ServletActionContext.getRequest();

        String username = userinputbean.getUsername();
        String password = userinputbean.getPassword();

        String Action;

        studentInfo.setUsername(username);
        studentInfo.setPassword(password);

        studentdao.logIn(studentInfo);

        boolean status = studentdao.logIn(studentInfo);
        if (status) {
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            System.out.println("Login Succesfull from LoginAction!");
            Action = "success";

        } else {
            System.out.println("Login Failure from LoginAction.");
            Action = "failure";

        }
        out.flush();
        out.close();

        System.out.println("Action : " + Action);
        return Action;
    }

}
