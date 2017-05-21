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
		            <h2>Making order...</h2>

		            <p>Add some things to your basket to buy it in future<p>
		            <!--<h4>
		                Thanks for choosing us.
		            <h4>-->
		            <form action = "MainServlet" method="GET" id="o">
		            	
				            <input type="hidden" name="action" value="create_order">
				            <div class="main1">

				            	<style>#field { text-align: right; }</style>
					            <div class="field" id="field">
						            <label for="basket_id">Basket id</label>
						            <input class="edit" type="text" name ="basket_id" placeholder="basket_id" id="basket_id"/>
					            </div>

				            	<style>#field { text-align: right; }</style>
					            <div class="field" id="field">
						            <label for="user_id">User id</label>
						            <input class="edit" type="text" name ="user_id" placeholder="user_id" id="user_id"/>
					            </div>

					            <style>#field { text-align: right; }</style>
					            <div class="field" id="field">
						            <label for="uid">UID </label>
						            <input class="edit" type="text" name ="uid" placeholder="uid" id="uid"/>
					            </div>

					            <style>#field { text-align: right; }</style>
					            <div class="field" id="field">
						            <label for="date_start">Pick-up date</label>
						            <input class="edit" type="text" name ="date_start" placeholder="date_start" id="date_start"/>
					            </div>

				            </div>
				            <!--<input type="submit" value="Order"/>-->
				            <div class ="text_order_color" >
		            			<a href="#"  onclick="document.getElementById('o').submit(); return false;">
		            			<h1>ORDER</h1></a>
		            		</div>
		            <img src="http://www.simply-chalets.co.uk/img/slider/skis.jpg">
		        </section>       

	    	</div>
			
	    
	    <footer>
	        <h3>Contact us</h3>
	        <p>Copyright 2017 © mazets_anton@tut.by</p>
    	</footer>
	</body>
</html>