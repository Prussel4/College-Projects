<%-- 
    Document   : AccountDetails
    Created on : Oct 16, 2017, 8:33:08 PM
    Author     : Paul Russell
--%>

<link rel="Stylesheet" type="text/css" href="ChattBank.css">	
<head>
<title>Login</title>
</head>

<body>
	<div id="MainWrap">
	<div id="HeadWrap"><h1>Your Account</h1></div>
	<div id="ImageWrap"> 
            <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
		<form action="/ChattBank/AccountLookupServlet" method="get" target="_blank">
                    <% Object a1 = request.getAttribute("Account"); %>
			<table>	
			<tr>
				<th>Your Info</th>
			</tr>	
			<tr>	
				<td>
				<h5>AcctNO</h5>
				</td>
				<td>
				<input type="textbox" name="AcctNO" label="AcctNO"  value ="<c:out value="${Account.acctNo}"/>" required>
				</td>
			</tr>
			<tr>
				<td><h5>CustomerID</h5></td>
				<td><input type="textbox" name="CustID" label="CustomerID" value ="<c:out value="${Account.cid}"/>" readonly></td>
			</tr>
			<tr>	
				<td>
				<h5>Type</h5>
				</td>
				<td>
				<input type="textbox" name="Type" label="Type" value ="<c:out value="${Account.type}"/>" readonly readonly>
				</td>
			</tr>
			<tr>
				<td><h5>Balance</h5></td>
				<td><input type="textbox" name="Balance" value ="<c:out value="${Account.balance}"/>" label="Balance" readonly></td>
			</tr>	
			<tr>	
				<td><input type="submit" value="Lookup"></td>
				<td><input type="submit" value="Clear"></td>
			</tr>
			</table>
				</form>
	</div>
</body>	
</html>