/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Adore96.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author kasun_k
 */
public class DatabaseConnection {
static Connection con = null;
static String url;

    public static Connection getConnection()
    {
        try
        {
            url = "jdbc:mysql://localhost:3306/taskone?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,"root","");
            System.out.println("Connection Success.");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println(e);
        }  catch (SQLException ex)
        {
            System.out.println(ex);
            ex.printStackTrace();
        }
        return con;
    }

}
