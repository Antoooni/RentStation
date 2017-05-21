package by.htp.service;

import java.sql.Date;

import by.htp.Lesson7.equipment.domain.Order;
import by.htp.Lesson7.equipment.domain.User;
import by.htp.dao.OrderDao;
import by.htp.dao.OrderDaoImpl;
import by.htp.dao.UserDao;
import by.htp.dao.UserDaoImpl;

public class OrderServiceImpl implements OrderService {
	private OrderDao dao;
	
	public OrderServiceImpl(){
		dao = new OrderDaoImpl();
	}

	

	@Override
	public Order makeOrder(User user, int basket_id, String uid, Date start) {
		Order order=new Order();
		order.setUser(user);
		order.setBasketId(basket_id);
		order.setUid(uid);
		order.setPickUpDate(start);
		
		dao.createOrder(order);
		
		return null;//заглушка
	}

}
