<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
  <head lang="en">
      <meta charset="UTF-8">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <title>Admin page</title>
      <link rel="stylesheet" type="text/css" href="flexbox-layout.css"> 
      <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js?ver=1.4.2"></script>
  </head>
<body>
    <div class="container">
     <header>
        <nav>
        </nav>
      </header>
      <div class="main-and-sidebar-wrapper">
        <section class="main">
            <h2>Welcome admin! </h2>   
        </section>
      </div>
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
      <footer>
        <h3>Contact us</h3>
        <p>Copyright 2017 © mazets_anton@tut.by</p>
      </footer>
    </div>
</body>
</html>