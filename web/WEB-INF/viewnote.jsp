<%-- 
    Document   : viewnote.jsp
    Created on : Sep 20, 2019, 3:49:28 PM
    Author     : 797462
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Note Keeper</title>
    </head>
    
    <body>
        <h1>Simple Note Keeper</h1>
    
        <h2>View Note</h2>

        <h4>Title:</h4> ${Note.title}

        <h4>Contents:</h4> ${Note.context}
        <br>
        <br>
        <a href="Note?edit"> Edit </a>
      ${whatever3}
        
    </body>
</html>
