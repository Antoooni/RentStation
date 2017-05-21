package by.htp.servlet.command;


import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import by.htp.Lesson7.equipment.domain.Accessories;
import by.htp.Lesson7.equipment.domain.Equipment;
import by.htp.Lesson7.equipment.domain.User;
import by.htp.service.EquipmentService;
import by.htp.service.EquipmentServiceImpl;
import by.htp.service.ServiceNoSuchUserException;
import by.htp.service.UserService;
import by.htp.service.UserServiceImpl;

import static by.htp.util.ConstantValue.*;

public class LoginCommandAction implements СommandAction {
	private UserService userService;
	private EquipmentService equipService;
	
	
	public LoginCommandAction(){
		userService = new UserServiceImpl(); //Не совсем правильно создавать в конструкторе
		equipService = new EquipmentServiceImpl();
	}
	
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		String login = request.getParameter(REQUEST_PARAM_LOGIN); //обращение к полю без точки т.к. стат импорт
		String password = request.getParameter(REQUEST_PARAM_PASSWORD);
		
		HttpSession session = request.getSession(true);
		String userData = equipService.userData(login, password);
		//session.setAttribute(REQUEST_PARAM_USER_NAME, userData);
		//
		
		String page = PAGE_DEFAULT;
		
		
		
		User user;
		try {
			user = userService.authorise(login, password);
			if (!user.isRole()) {
				
				page = PAGE_USER_NAME;
				List<Equipment> equipment = equipService.listEq();
				// показать список всего оборудования
				request.setAttribute(REQUEST_PARAM_LIST_EQUIPMENT, equipment);
				
				List<Accessories> accessories = equipService.listAc();
				// показать список всех аксессуаров
				request.setAttribute(REQUEST_PARAM_LIST_ACCCESSORIES, accessories);
				//имя пользователя из сессии
				session.setAttribute(REQUEST_PARAM_USER_NAME, userData);

			} else {
				
//				request.setAttribute("list", users);
				page = PAGE_ADMIN_NAME;
				
			}
		} catch (ServiceNoSuchUserException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			page= PAGE_ERROR;
			request.setAttribute(REQUEST_PARAM_ERROR_MSG, e.getMessage());
		}
		
		
		return page;
	}

}
