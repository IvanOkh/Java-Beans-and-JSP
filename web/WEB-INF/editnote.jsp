<%-- 
    Document   : editnote.jsp
    Created on : Sep 20, 2019, 3:50:02 PM
    Author     : 797462
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        
        <h2>Edit Note</h2>
        <div>
            <h4>Title:
                <textarea rows="1" cols="25" name="inputOne">${Note.title}</textarea> 
            </h4>
        </div>
        
        <div>
            <h4>Context:
                <textarea rows="4" cols="25"name="inputTwo">${Note.context}</textarea> 
            </h4>           
        </div>
        <br>
        <button type="button">Save</button>
    </body>
</html>
