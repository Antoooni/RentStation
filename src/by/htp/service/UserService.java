package by.htp.service;

import by.htp.entity.User;

public interface UserService {
	User authirise(String login, String password) throws ServiceNoSuchUserException;
	boolean logOut(User user);

}
