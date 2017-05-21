package by.htp.servlet.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.Lesson7.equipment.domain.User;
import by.htp.service.OrderService;
import by.htp.service.OrderServiceImpl;

import static by.htp.util.ConstantValue.*;

import java.sql.Date;

public class OrderCreateAction implements ÑommandAction{
	
	private OrderService service;
	
	public OrderCreateAction(){
		service=new OrderServiceImpl();
	}

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		//String page = PAGE_ORDER_ALL;
		String page = PAGE_ORDER_COMPLETED;
		
		String basketId=request.getParameter(PARAM_BASKET_ID);
		String userId =request.getParameter(PARAM_USER_ID);
		String uid=request.getParameter(PARAM_UID);
		String dateStart=request.getParameter(PARAM_DATE_START);
		
		User user=new User();
		user.setUserId(Long.valueOf(userId));
		
//		Equimpent equipment = new Equimpent();
//		equipment.setEquipmentId(Long.valueOf(equipmentId));
		
		Date start = Date.valueOf(dateStart);
		int basket= Integer.valueOf(basketId);
		//Date end = Date.valueOf(dateEnd);
		
		service.makeOrder(user, basket, uid, start);
		
		return page;
	}

}
