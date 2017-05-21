<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Admin page</title>
	<style>
	   table {
	   margin: auto;
	   }
    </style>
</head>
<body background="back_ground1_copy.jpg">
Welcome admin!
<table border="1" style="height: 100px; ">
   <tr>
    <th style="width: 36px; ">#</th>
    <th style="width: 160px; height: 24px; ">Brand</th>
    <th style="width: 160px; height: 24px; ">Price</th>
   </tr>
  <c:forEach items="${list}" var="i">
    <h3>
     <tr> 
	     <td> <c:out value="${list.indexOf(i)}"/></td>
	     <td> <c:out value="${i.getLogin()}" /></td>
	     <td><c:out value="${i.getPassword()}" /> </td>
     </tr>
    </h3>
  </c:forEach>
</table>
  
</body>
</html>