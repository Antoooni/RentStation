package by.htp.dao;

import java.sql.Date;
import java.util.List;


import by.htp.Lesson7.equipment.domain.Order;

public interface OrderDao {
	//boolean createOrder(User user, Equipment equimpent, Date start, Date end);
	boolean createOrder (Order order);
	List<Order>fetchAll();
}
