<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Candidate Bean Test</title>
</head>
<body>
<h1>Welcome Candidate your details are given Below</h1>
<%
if("POST".equalsIgnoreCase(request.getMethod()) && request.getParameter("submit")!=null)
{
%>
<jsp:useBean id="candidateBean" class="java.programs.CandidateBean" scope="session">
<jsp:setProperty name="candidateBean" property="*" />
</jsp:useBean>
<%

out.println("<b>Name: </b>"+candidateBean.getName()+"</br>");
out.println("<b>Address: </b>"+candidateBean.getAdd()+"</br>");
out.println("<b>Phone Number: </b>"+candidateBean.getNo()+"</br>");
out.println("<b>Id: </b>"+candidateBean.getId()+"</br>");
out.println("<b>Email: </b>"+candidateBean.getEmail()+"</br>");
}
%>

</body>
</html>