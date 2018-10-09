<%-- 
    Document   : shoppingList
    Created on : Oct 4, 2018, 12:14:23 PM
    Author     : 758243
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shopping List</title>
    </head>
    <body>
        <h1>Shopping List</h1>
        Hello, ${username} 
        <a href="?action=logout">Logout</a>
        <h3>List</h3>
        <form method="post" action="ShoppingList">
            <input type="hidden" name="action" value="addItem">
            
        </form>
    </body>
</html>
