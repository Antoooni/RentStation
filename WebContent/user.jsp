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
        <form action = "MainServlet" method="GET" id="home">
            <input type="hidden" name="action" value="go_home">
            <!--<input type="submit" value="Home"/>-->
            <div class ="text_order_color" >
              <a href="#"  onclick="document.getElementById('home').submit(); return false;">
                <h1>Home</h1>
              </a>
            </div>
        </form>
        <form name="order_form" action = "MainServlet" method="GET" id="form1">
	            <input type="hidden" name="action" value="make_order">
	           <!--  <input type="submit" value="make Order1" /> -->
             <div class ="text_order_color" >
	             <a href="#" onclick="document.getElementById('form1').submit(); return false;"><h3>Make order</h3></a>
             </div>
        </form>
            <li>
            </li>
        </nav>
      </header>
      <div class="main-and-sidebar-wrapper">
        <section class="main">
            <h2>Welcome <c:out value ="${user_name}"/> </h2>
        </section>
      </div>
      <h2>All equipment</h2>
      <table border="1" >
          <tr>
            <th style="width: 36px; ">#</th>
            <th style="width: 160px; height: 24px; ">Brand</th>
            <th style="width: 160px; height: 24px; ">Category</th>
            <th style="width: 160px; height: 24px; ">Price</th>
          </tr>
        <c:forEach items="${list_eq}" var="i">
          <h3>
           <tr> 
             <td> <c:out value="${list_eq.indexOf(i)}"/></td>
             <td> <c:out value="${i.getBrand()}" /></td>
             <td> <c:out value="${i.getCategory()}" /> </td>
             <td> <c:out value="${i.getPrice()}" /> </td>
           </tr>
          </h3>
        </c:forEach>
      </table>

      <br>
      <h2>All Accessories</h2>
      <table border="1" >
          <tr>
            <th style="width: 36px; ">#</th>
            <th style="width: 160px; height: 24px; ">Brand</th>
            <th style="width: 160px; height: 24px; ">Name</th>
            <th style="width: 160px; height: 24px; ">Type</th>
            <!--<th style="width: 160px; height: 24px; ">Color</th>-->
            <th style="width: 160px; height: 24px; ">Price</th>
          </tr>
        <c:forEach items="${list_ac}" var="i">
          <h3>
           <tr> 
             <td> <c:out value="${list_ac.indexOf(i)}"/></td>
             <td> <c:out value="${i.getBrand()}" /></td>
             <td> <c:out value="${i.getName()}" /></td>
             <td> <c:out value="${i.getType()}" /> </td>
             <!--<td> <c:out value="${i.getColor()}" /> </td>-->
             <td> <c:out value="${i.getPrice()}" /> </td>
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