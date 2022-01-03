<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="str" value="<%=new java.util.Date()%>" />  
    <table border="2" width="100%">  
      <tr>  
        <td width="100%" colspan="2" bgcolor="#FF7000">  
          <p align="center">  
            <b>  
              <font color="#000000" size="6">MarkSheet  
              </font>  
            </b>  
          </p>  
        </td>  
      </tr>  
  
        <tr>  
          <td width="50%"  bgcolor="#FFEBCD">  
    
          </td>  
          <td width="50%" bgcolor="#FFEBCD">  
       
              <font color="#000000" size="6">Date:  
              <fmt:formatDate value="${str}" type="both"  
              timeStyle="long" dateStyle="long" />  
              </font>  
         
          </td>  
        </tr>  
        <tr>
        
        <td width="100%" colspan="2"  bgcolor="#FFEBCD"> 
        <font color="#000000" size="5"> Marks 1 :
        <c:set var="marks1" scope="session" value="70"/>  
		<c:out value="${marks1}"/>
		 | Max marks : 100
		</font>		
        </td>
        </tr>
                <tr>
        
        <td width="100%" colspan="2"  bgcolor="#FFEBCD"> 
        <font color="#000000" size="5"> Marks 2 :
        <c:set var="marks2" scope="session" value="60"/>  
		<c:out value="${marks2}"/>
		 | Max marks : 100
		</font>		
        </td>
        </tr>
                <tr>
        
        <td width="100%" colspan="2"  bgcolor="#FFEBCD"> 
        <font color="#000000" size="5"> Marks 3 :
        <c:set var="marks3" scope="session" value="85"/>  
		<c:out value="${marks3}"/>
		 | Max marks : 100
		</font>		
        </td>
        </tr>
                <tr>
        
        <td width="100%" colspan="2"  bgcolor="#FFEBCD"> 
        <font color="#000000" size="5"> Marks 4 :
        <c:set var="marks4" scope="session" value="90"/>  
		<c:out value="${marks4}"/>
		 | Max marks : 100
		</font>		
        </td>
        </tr>
                <tr>
        
        <td width="100%" colspan="2"  bgcolor="#FFEBCD"> 
        <font color="#000000" size="5"> Marks 5 :
        <c:set var="marks5" scope="session" value="77"/>  
		<c:out value="${marks5}"/>
		 | Max marks : 100
		</font>		
        </td>
        </tr>
         <tr>
        
        <td width="100%" colspan="2"  bgcolor="#FFEBCD"> 
        <font color="#000000" size="5"> Total Marks :
        <c:set var="marks1" scope="session" value="70"/>
        <c:set var="marks2" scope="session" value="60"/>
        <c:set var="marks3" scope="session" value="85"/>
        <c:set var="marks4" scope="session" value="90"/>
        <c:set var="marks5" scope="session" value="77"/>
        <c:set var="total" value="${0}"/>
        <c:set var="total" value="${marks1 + 10}"/>  
		<c:out value="${total}"/>
		</font>		
        </td>
        </tr>
    </table>  
</body>
</html>