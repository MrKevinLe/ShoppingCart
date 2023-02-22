<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Shopping Cart</title>
</head>
<body>
<h1>Practice Shopping Cart</h1>
<a href="/create">Create</a>

<c:forEach items="${allProducts }" var="one">
<ul>
	<li><h3>${one.name }</h3> </li>
	<li> Price  : $${one.price } </li>
	<li>Stock : ${one.stock } </li>
	<li><form action="/delete/${one.id}" method="post">
    <input type="hidden" name="_method" value="delete">
    <input type="submit" value="Delete">     
	</form></li>
</ul>
<hr/>

</c:forEach>

</body>
</html>