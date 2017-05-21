package by.htp.service;

import java.sql.Date;

import by.htp.Lesson7.equipment.domain.Order;
import by.htp.Lesson7.equipment.domain.User;

public interface OrderService {
	public Order makeOrder(User userId, int basket_id, String uid, Date pickUpDate);
}
