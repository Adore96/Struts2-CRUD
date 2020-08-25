<%-- 
    Document   : Login
    Created on : Aug 14, 2020, 5:36:18 PM
    Author     : kasun_k
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>   
<html>   
    <head>  
        <meta name="viewport" content="width=device-width, initial-scale=1">  
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
        <title> Login Page </title>  
        <style>   
            Body {  
                font-family: Calibri, Helvetica, sans-serif;  
                background-color: white;  
            }  
            button {   
                background-color: #4CAF50;   
                width: 100%;  
                color: orange;   
                padding: 15px;   
                margin: 10px 0px;   
                border: none;   
                cursor: pointer;   
            }   
            form {   
                border: 3px solid #f1f1f1;   
            }   
            input[type=text], input[type=password] {   
                width: 100%;   
                margin: 8px 0;  
                padding: 12px 20px;   
                display: inline-block;   
                border: 2px solid green;   
                box-sizing: border-box;   
            }  
            button:hover {   
                opacity: 0.7;   
            }   
            .cancelbtn {   
                width: auto;   
                padding: 10px 18px;  
                margin: 10px 5px;  
            }   


            .container {   
                padding: 25px;   
                background-color: lightblue;  
            }   
        </style>  
        <script>
            history.pushState(null, null, location.href);
            window.onpopstate = function () {
                history.go(1);
            };
        </script>
    </head>    
    <body>   

    <center> <h1> Student Login Form </h1> </center> 

    <s:form action="LoginAction">
        <s:textfield label="User Name" key="username" size="15"/>
        <s:password label="Password" key="password" size="15"/>
        <s:submit align="center"/>
    </s:form>
    <a href="RegisterStudent.jsp">New Student? Signup Here.</a><br>


</body>     
</html>  
