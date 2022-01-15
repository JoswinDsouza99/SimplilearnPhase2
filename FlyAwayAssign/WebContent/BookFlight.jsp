<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FlyAway</title>
</head>
<body >
<br>
<a href=HomePage.jsp style="color:black;text-decoration:none ;font-size:35px;font-weight:bold;">FlyAway</a>
<br><br>

<form action="confirmServlet" method="POST">

			
<table align="center">
<tr>
<td><img src="img/qr.png"  width="300" height="300"> <br></td>
</tr>
<tr>
<td align="center"> <h2>Scan QR to pay</h2></td>
</tr>
<tr>
<td align="center"> <input type="submit" value="Done" style="font-size:20pt; width:86pt; background:limegreen"/> </td>
</tr>

</table>
</form>
</body>
</html>
