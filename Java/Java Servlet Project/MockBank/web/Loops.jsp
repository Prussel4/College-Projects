<%-- 
    Document   : newjsp
    Created on : Oct 15, 2017, 11:19:42 PM
    Author     : Paul Russell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
  <%
      int i = 0;
     while (i < 10){
  %>
      <h4>Go Braves</h4><p>(<%= i %>)

 <%
i++; }      
 %>
</body>
</html>
