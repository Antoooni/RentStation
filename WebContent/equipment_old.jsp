<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Equipment page</title>
<style>
	   table {
	   margin: auto;
	   }
    </style>
</head>
<body background="back_ground1_copy.jpg">
Here will your equipments list
<!--  -->
<table border="1" style="height: 89px; ">
   <tr>
    <th style="width: 26px; ">#</th>
    <th style="width: 160px; height: 14px; ">Brand</th>
    <th style="width: 160px; height: 14px; ">Price</th>
   </tr>
  <c:forEach items="${list_eq}" var="i">
    <h3>
     <tr> 
	     <td> <c:out value="${list_eq.indexOf(i)}"/></td>
	     <td> <c:out value="${i.getName()}" /></td>
	     <td><c:out value="${i.getPrice()}" /> </td>
     </tr>
    </h3>
  </c:forEach>
</table>
<!-- -->
</body>
</html>