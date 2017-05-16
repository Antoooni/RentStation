package by.htp.service;

import java.sql.Date;

import by.htp.dao.OrderDao;
import by.htp.dao.OrderDaoImpl;
import by.htp.dao.UserDao;
import by.htp.dao.UserDaoImpl;
import by.htp.entity.Equimpent;
import by.htp.entity.Order;
import by.htp.entity.User;

public class OrderServiceImpl implements OrderService {
	private OrderDao dao;
	
	public OrderServiceImpl(){
		dao = new OrderDaoImpl();
	}

	

	@Override
	public Order makeOrder(User user, Equimpent equipment, Date start, Date end) {
		Order order=new Order();
		order.setEquipment(equipment);
		order.setUser(user);
		order.setDatStart(start);
		order.setDatEnd(end);
		
		dao.createOrder(order);
		
		return null;//заглушка
	}

}
