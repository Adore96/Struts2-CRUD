/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Adore96.model;

/**
 *
 * @author kasun_k
 */
public class StudentInfo {

    private String fname, lname, username, password, telephone;

    public StudentInfo() {
    }

    public StudentInfo(String username) {
        this.username = username;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public StudentInfo(String fname, String lname, String uname, String password, String telephone) {
        this.fname = fname;
        this.lname = lname;
        this.username = uname;
        this.password = password;
        this.telephone = telephone;
    }

    /////////////////////////////////////////////////////Validation.//////////////////////////////////////////////////////////
    
    
    public int LoginValidation() {

        if ((username == null || username.trim().equals("")) && (password == null || password.trim().equals(""))) {

            return 0;
        } else {

            return -1;
        }
    }

    public int RegisterValidation() {

        if ((username == null || username.trim().equals("")) && (password == null || password.trim().equals(""))) {
            System.out.println("Username or password is empty.");
            if ((fname == null || fname.trim().equals("")) && (lname == null || lname.trim().equals(""))) {
                System.out.println("fname or lname,username or password is empty.");
            } else {
                System.out.println("fname lname ok,uname password is empty");
            }
            return 0;
        } else {
            System.out.println("Register validation all parameters filled");
            return 1;
        }
    }

    public int AddStudentValidation() {

        if ((username == null || username.trim().equals("")) && (password == null || password.trim().equals(""))) {
            System.out.println("Username or password is empty.");
            if ((fname == null || fname.trim().equals("")) && (lname == null || lname.trim().equals(""))) {
                System.out.println("fname or lname,username or password is empty.");
            } else {
                System.out.println("fname lname ok,uname password is empty");
            }
            return 0;
        } else {
            System.out.println("AddStudent validation all parameters filled");
            return 1;
        }
    }

    public int UpdateStudentValidation() {

        if ((fname == null || fname.trim().equals("")) && (lname == null || lname.trim().equals("")) && (telephone == null || telephone.trim().equals(""))) {
            System.out.println("fname or lname,username or password is empty.");
        } else {
            System.out.println("fname lname ok,uname password is empty");
        }
        return 0;

    }
}
