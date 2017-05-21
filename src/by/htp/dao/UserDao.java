package by.htp.dao;

import by.htp.Lesson7.equipment.domain.User;

public interface UserDao {
	User fetchByCredentials(String login, String password);

}
