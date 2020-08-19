<%-- 
    Document   : AddStudent
    Created on : Aug 19, 2020, 4:02:39 PM
    Author     : kasun_k
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>   
<html>   
<head>  
<meta name="viewport" content="width=device-width, initial-scale=1">  
<title> Add Student Page </title>  
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
</head>    
<body>   
    
    <center> <h1>Add Student Form.</h1> </center> 
    
    <s:form action="AddStudent">
        <s:textfield label="First Name" key="fname"/>
        <s:textfield label="Last Name" key="lname"/>
        <s:textfield label="User Name" key="username"/>
        <s:password label="Password" key="password"/>
        <s:textfield label="Telephone Number" key="telephone"/>
        <s:submit/>
    </s:form>
    
</body>     
</html>  

