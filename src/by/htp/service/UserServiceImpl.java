package by.htp.service;

import by.htp.dao.UserDao;
import by.htp.dao.UserDaoImpl;
import by.htp.entity.User;

public class UserServiceImpl implements UserService {
	
	private UserDao dao;
	public UserServiceImpl(){
		dao = new UserDaoImpl();
	}

	@Override
	public User authirise(String login, String password) throws ServiceNoSuchUserException {
		// TODO Auto-generated method stub
		User user = dao.fetchByCredentials(login, password);
		if(user==null){
			throw new ServiceNoSuchUserException("Invalid credential");
		}
		/*
//		User user =null;
//		if ("user".equals(login) && "user".equals(password)){
//			user = new User("user1","user1", false);
//		}
//		else if("admin".equals(login) && "admin".equals(password)){
//			user = new User("admin1","admin1", true);
//		}
		else{
			throw new ServiceNoSuchUserException("Invalid credential");
		}
		*/
		return user;
	}

	@Override
	public boolean logOut(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
