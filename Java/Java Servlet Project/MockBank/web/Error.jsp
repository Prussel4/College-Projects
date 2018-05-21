<%@page import="Servlets.Customer"%>
<!DOCTYPE html>
<html lang="en">
<!-- 
Paul Russell
JAVA III
6/18/2017
 -->
<link rel="Stylesheet" type="text/css" href="ChattBank.css">	
<head>
<title>Login</title>
</head>

<body>
	<div id="MainWrap">
	<div id="HeadWrap"><h1>ChattBank</h1></div>
	<div id="ImageWrap"> 
		<form action="/ChattBank/LoginServlet" method="get" target="_blank">
                   <% Object sss = request.getAttribute("ID"); %>
                   <% if( sss != null){ %>
                   <p> The ID for the Email you entered is <%= session.getAttribute("ID") %> </p>
                    <% }else {%>
                    <p>Incorrect Email</p>
                    <% } %>
                       <h1>  </h1>
                        <table>	
			<tr>
                            <th><a href="LoginServlet"> Login </a></th>
			</tr>	
			<tr>	
				<td>
				<h5>Email</h5>
				</td>
				<td>
                                    <input type="text" name="Email" required />
				</td>
			</tr>
			<tr>
				<td><h5>Password</h5></td>
				<td>
                                    <input type="password" name="Password" required/>
                                </td>
			</tr>	
			<tr>	
				<td><input type="submit" value="Submit"></td>
			</tr>
			</table>
				</form>
	</div>
</body>	
</html>
