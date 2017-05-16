package by.htp.dao;

import by.htp.entity.User;

public interface UserDao {
	User fetchByCredentials(String login, String password);

}
