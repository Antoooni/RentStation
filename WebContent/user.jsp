<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
  <head lang="en">
      <meta charset="UTF-8">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <title>User page</title>
      <link rel="stylesheet" type="text/css" href="flexbox-layout.css"> 
      <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js?ver=1.4.2"></script>
  </head>
  <body>
    <div class="container">
     <header>
        <nav>
        <form name="order_form" action = "MainServlet" method="GET" id="form1">
	            <input type="hidden" name="action" value="make_order">
	           <!--  <input type="submit" value="make Order1" /> -->
	           <a href="#" onclick="document.getElementById('form1').submit(); return false;"><h1>Make order</h1></a>
        </form>
            <li>
	            
            </li>
        </nav>
      </header>
      <div class="main-and-sidebar-wrapper">
        <section class="main">
            <h2>Welcome user </h2>
        </section>
      </div>
      <table border="1" >
          <tr>
            <th style="width: 36px; ">#</th>
            <th style="width: 160px; height: 24px; ">Brand</th>
            <th style="width: 160px; height: 24px; ">Price</th>
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
      <footer>
        <h3>Contact us</h3>
        <p>Copyright 2017 © mazets_anton@tut.by</p>
      </footer>
    </div>
  </body>
</html>