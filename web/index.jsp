<%-- 
    Document   : index
    Created on : 01-10-2015, 19:49:43
    Author     : Andreas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        
        <div style="margin-top: 20px;">
            <input type="text" id="amount" placeholder="Number of persons">
            <input type="text" id="params" value="fName,lName">
            <button id="btn">get</button>
        </div>
        
        <div id="dataHere">
            
        </div>
        
        <script src="https://code.jquery.com/jquery-2.1.4.min.js"></script>
        <script src="main.js" type="text/javascript"></script>
    </body>
</html>
