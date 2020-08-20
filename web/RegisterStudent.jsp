<%-- 
    Document   : RegisterStudent
    Created on : Aug 18, 2020, 9:30:55 AM
    Author     : kasun_k
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>   
<html>   
<head>  
<meta name="viewport" content="width=device-width, initial-scale=1">  
<title> Registration Page </title>  
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
    
    <center> <h1> Student Registration Form </h1> </center> 
    
    <s:form action="RegisterAction">
        <s:textfield label="First Name" key="fname" size="15" />
        <s:textfield label="Last Name" key="lname" size="15"/>
        <s:textfield label="User Name" key="username" size="15"/>
        <s:password label="Password" key="password" size="8" />
        <s:textfield label="Telephone Number" key="telephone" size="10"/>
        <s:submit/>
    </s:form>
    

</body>     
</html>  

