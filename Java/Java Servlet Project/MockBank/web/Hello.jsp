<%-- 
    Document   : Hello
    Created on : Oct 16, 2017, 1:43:42 PM
    Author     : Paul Russell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
  <%
      int i = 1;
     while (i < 7){
  %>
      <h<%= i %>>Go Braves</h<%= i %>>

 <%
i++; }      
 %>
</body>
</html>
