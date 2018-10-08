<%-- 
    Document   : register
    Created on : Oct 4, 2018, 12:14:13 PM
    Author     : 758243
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shopping List - Register</title>
    </head>
    <body>
        <h1>Shopping List</h1>
        <form method="post" action="ShoppingList">
            Username: <input type="text" name="userName">
            <input type="hidden" name="action" value="register" >
            <input type="submit" value="Register name">
        </form>
    </body>
</html>
