package by.htp.service;

import by.htp.Lesson7.equipment.domain.User;

public interface UserService {
	User authorise(String login, String password) throws ServiceNoSuchUserException;
	boolean logOut(User user);

}
