<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <%-- This is JSP ccmments using JSP COmment tag--%>
	<%  
	String name=request.getParameter("userName");  
	String age=request.getParameter("userAge");  
	String city=request.getParameter("userCity");  
	String gender=request.getParameter("userGender");  
	String email=request.getParameter("userEmail");  
	out.print("welcome "+name);  
	out.print("\nYour age "+age);
	out.print("\nYour city "+city);
	out.print("\nYour gender "+gender);
	out.print("\nYour email "+email);
	%>  
	<br><br><br>
	
	Expression Tag:::: Current Time: <%= java.util.Calendar.getInstance().getTime() %>  
	<%= "Welcome "+ request.getParameter("userName") %>  
	<br><br><br>
	
	Declaration Tag::: 
	<%! int l=10,b=20,h=5; 

	%>  
    <%= "Area of rectange is:"+ l*b*h %>  
    
    <!-- We are on this Page  -->
</body>
</html>