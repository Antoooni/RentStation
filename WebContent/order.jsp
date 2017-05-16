<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head lang="en">
      <meta charset="UTF-8">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <title>Order</title>
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
	            <h2>Making order...</h2>

	            <p>Add some things to your basket to buy it in future<p>
	            <!--<h4>
	                Thanks for choosing us.
	            <h4>-->
	            <style type="text/css">
	            	input[type="text"] {
					   border: 1px solid #cccccc; //цвет рамки
					   border-radius: 3px; //закругление углов (общее)
					   -webkit-border-radius: 3px; //закругление углов (Google Chrome)
					   -moz-border-radius: 3px; //закругление углов (FireFox)
					   -khtml-border-radius: 3px; //закругление углов (Safari)
					   background: #ffffff !important; // желательно прописывать, так как в Chrome при сохранных данных оно может быть желтым
					   outline: none; // удаляет обводку в браузерах хром(желтая) и сафари(синяя)
					   height: 24px; // высота на свое усмотрение
					   width: 120px; // ширина на свое усмотрение
					   color: #cccccc; //цвет шрифта в обычном состоянии
					   font-size: 11px; // Размер шрифта
					   font-family: Tahoma; // Стиль шрифта
					}	
	            </style>
	            <form action = "MainServlet" method="GET">
			            <input type="hidden" name="action" value="create_order">

			            <input type="text" name ="user_id" placeholder="user_id"/>
			            <br>
			            <input type="text" name ="equipment_id"/>
			            <input type="text" name ="date_start"/>
			            <input type="text" name ="date_end"/>
			            <input type="submit" value="Order" />
			    </form>
				<br>
		            

	            <img src="http://www.simply-chalets.co.uk/img/slider/skis.jpg">  
	               
	        </section>       
    	</div>
			
	    
	    <footer>
	        <h3>Contact us</h3>
	        <p>Copyright 2017 © mazets_anton@tut.by</p>
    	</footer>
	</body>
</html>