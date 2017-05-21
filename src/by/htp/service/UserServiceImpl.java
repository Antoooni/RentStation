package by.htp.service;

import by.htp.Lesson7.equipment.domain.User;
import by.htp.dao.UserDao;
import by.htp.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {
	
	private UserDao dao;
	public UserServiceImpl(){
		dao = new UserDaoImpl();
	}

	@Override
	public User authorise(String login, String password) throws ServiceNoSuchUserException {
		// TODO Auto-generated method stub
		User user= dao.fetchByCredentials(login, password);
		if(user==null){
			throw new ServiceNoSuchUserException("Invalid credential");
		}
		
		return user;
	}

	@Override
	public boolean logOut(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
