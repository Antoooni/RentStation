<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
  <head lang="en">
      <meta charset="UTF-8">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <title>Error</title>
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
                <h2>Home</h2>
              </a>
            </div>
        </form>
        </nav>
      </header>
      <div class="main-and-sidebar-wrapper">
        <section class="main">
            <h3>Oops:( Something wrong...</h3><br>
            <a>Probably this user does not exist</a>   
            <img src="sadness.png"> 
        </section>
      </div>
      <footer>
        <h3>Contact us</h3>
        <p>Copyright 2017 © mazets_anton@tut.by</p>
      </footer>
    </div>
  </body>
</html>