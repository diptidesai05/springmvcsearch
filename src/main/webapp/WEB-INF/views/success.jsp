<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>    
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h1>${student}</h1>
 <h2> Name is ${student.userName} </h2>
 <h2> your courses </h2>
 <c:forEach var="i" items="${courses}">
 <h3>${i}</h3>
 </c:forEach>
 <hr>
 <h1> Address Street is ${student.address.street}</h1>
 <h1> Address City is ${student.address.city}</h1>
</body>
</html>