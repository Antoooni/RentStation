package by.htp.service;

import java.sql.Date;

import by.htp.entity.Equimpent;
import by.htp.entity.Order;
import by.htp.entity.User;

public interface OrderService {
	public Order makeOrder(User userId, Equimpent equipment_Id, Date start, Date end);
}
