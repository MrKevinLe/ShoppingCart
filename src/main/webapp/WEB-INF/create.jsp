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
<title>Insert title here</title>
</head>
<body>
<form:form action="/submit" method="post" modelAttribute="product" >

<p>
<form:label path="name"> Name: </form:label>
<form:input path="name"/>
</p>
<p>
<form:label path="price"> price: </form:label>
<form:input path="price" type="number"/>
</p>
<p>
<form:label path="stock"> stock: </form:label>
<form:input path="stock" type="number"/>
</p>
<button type="submit" class="btn btn-primary">Submit</button>
</form:form>
<br/>
<button><a href="/">Cancel</a></button>


</body>
</html>