package by.htp.servlet.command;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import by.htp.entity.Equimpent;
import by.htp.entity.User;
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
		String page = PAGE_DEFAULT;
		String login = request.getParameter(REQUEST_PARAM_LOGIN); //обращение к полю без точки т.к. стат импорт
		String password = request.getParameter(REQUEST_PARAM_PASSWORD);
		
		User user;
		try {
			user = userService.authirise(login, password);
			if (!user.isRole()) {
				page = PAGE_USER_NAME;
				List<Equimpent> equipment = equipService.list();
				// показать список всего оборудования
				request.setAttribute(REQUEST_PARAM_LIST_EQ, equipment);

			} else {
//				List<User> users= new ArrayList<User>();
//				users.add(new User("login_admin1", "password_admin1", true));
//				users.add(new User("login_admin2", "password_admin2", true));
//				users.add(new User("login_admin3", "password_admin3", true));
				// дома показать список оборудования из XML арендованного юзером
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
