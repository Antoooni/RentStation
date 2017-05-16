package by.htp.dao;

import java.sql.Date;
import java.util.List;

import by.htp.entity.Equimpent;
import by.htp.entity.Order;
import by.htp.entity.User;

public interface OrderDao {
	//boolean createOrder(User user, Equimpent equimpent, Date start, Date end);
	boolean createOrder (Order order);
	List<Order>fetchAll();
}
