<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- set and out -->
----------Employee Salary------
<c:set var="Sal_emp1" scope="session" value="${20000}"/>
Salary of Emp 1: <c:out value="${Sal_emp1}"/> <br/>
<c:set var="Sal_emp2" scope="session" value="${14000}"/>
Salary of Emp 2: <c:out value="${Sal_emp2}"/> <br/>
<c:set var="Sal_emp3" scope="session" value="${25000}"/>
Salary of Emp 3: <c:out value="${Sal_emp3}"/> <br/>
<c:set var="Sal_emp4" scope="session" value="${10000}"/>  
Salary of Emp 4: <c:out value="${Sal_emp4}"/> 
<br><br>





<br><br>
<!-- If condition -->
----------If Attribute------
<c:set var="income" scope="session" value="${Sal_emp1}"/>  
<c:if test="${income > 9000 && income < 13000}">  
   <p>Bonus: <c:out value="${5000}"/><p>
   </c:if>
<c:if test="${income > 13500 && income < 21000}">  
   <p>Bonus: <c:out value="${7000}"/><p>   
  </c:if>
<c:if test="${income > 22000 && income < 26000}">  
   <p>Bonus: <c:out value="${9000}"/><p>   
  </c:if>
<c:if test="${income > 28000}">  
   <p>Bonus: <c:out value="${10000}"/><p>   
  </c:if>
  
  
  <c:set var="income" scope="session" value="${Sal_emp2}"/>  
<c:if test="${income > 9000 && income < 13000}">  
   <p>Bonus: <c:out value="${5000}"/><p>
   </c:if>
<c:if test="${income > 13500 && income < 21000}">  
   <p>Bonus: <c:out value="${7000}"/><p>   
  </c:if>
<c:if test="${income > 22000 && income < 26000}">  
   <p>Bonus: <c:out value="${9000}"/><p>   
  </c:if>
<c:if test="${income > 28000}">  
   <p>Bonus: <c:out value="${10000}"/><p>   
  </c:if>
  
  
  <c:set var="income" scope="session" value="${Sal_emp3}"/>  
<c:if test="${income > 9000 && income < 13000}">  
   <p>Bonus: <c:out value="${5000}"/><p>
   </c:if>
<c:if test="${income > 13500 && income < 21000}">  
   <p>Bonus: <c:out value="${7000}"/><p>   
  </c:if>
<c:if test="${income > 22000 && income < 26000}">  
   <p>Bonus: <c:out value="${9000}"/><p>   
  </c:if>
<c:if test="${income > 28000}">  
   <p>Bonus: <c:out value="${10000}"/><p>   
  </c:if>
  
  
  <c:set var="income" scope="session" value="${Sal_emp4}"/>  
<c:if test="${income > 9000 && income < 13000}">  
   <p>Bonus: <c:out value="${5000}"/><p>
   </c:if>
<c:if test="${income > 13500 && income < 21000}">  
   <p>Bonus: <c:out value="${7000}"/><p>   
  </c:if>
<c:if test="${income > 22000 && income < 26000}">  
   <p>Bonus: <c:out value="${9000}"/><p>   
  </c:if>
<c:if test="${income > 28000}">  
   <p>Bonus: <c:out value="${10000}"/><p>   
  </c:if>


<!-- remove -->
----------Remove Attribute------ 
<p>Before Remove Value is: <c:out value="${income}"/></p>  
<c:remove var="income"/>  
<p>After Remove Value is: <c:out value="${income}"/></p>  
<br><br>



</body>
</html>