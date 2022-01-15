<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br>
<a href=search.jsp style="color:black;text-decoration:none;font-size:35px;font-weight:bold;">FlyAway</a>
<br><br>
<center>

<h1><b>Thank you for booking!!</b></h1>
<br><br><br>

<form onload="confirmServlet">
</form>
<table style="border:1px solid black; align:left;">
				<tr style="text-align:center; width:100%; margin: 0px auto;">
					<th>Airline Name</th>
					<th>Price</th>
					<th>Flight No</th>
					<th>Source City</th>
					<th>Destination</th>
				</tr>
				<c:forEach var="seat" items="${seatList}">
				
					<tr style="text-align:center; width:100%; margin: 0px auto;">
						<td>${seat.airline_name}</td>
						<td>${seat.price}</td>
						<td>${seat.flight_no}</td>	
						<td>${seat.source_city}</td>
						<td>${seat.destination}</td>
					</tr>
					</c:forEach>
				
</table>
<br> <br>
<a href="home.jsp"><h2>Go back</h2></a>	
</center>
</body>
</html>