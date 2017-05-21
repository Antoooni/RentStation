package by.htp.dao;

import static by.htp.util.ConstantValue.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import by.htp.Lesson7.equipment.domain.User;

public class UserNameDaoImpl implements UserNameDao {

	@Override
	public String getUserName(String login, String password) {
		String name=null;

		ResourceBundle bundle = ResourceBundle.getBundle("config");
		String dbUrl = bundle.getString("db.url");
		String dbUser = bundle.getString("db.login");
		String dbPass = bundle.getString("db.pass");
		System.out.println(dbUrl + " " + " " + dbUser + " " + dbPass);
		String dbName = bundle.getString("db.driver.name");

		try {
			try {
				Class.forName(dbName);
				Connection connection = DriverManager.getConnection(dbUrl, dbUser, dbPass);
				PreparedStatement ps = connection.prepareStatement(SQL_STATEMENT_USER_NAME);
				ps.setString(1, login); // код для PreparedStatement
				ps.setString(2, password); // код для PreparedStatement
				ResultSet rs = ps.executeQuery(); // код для PreparedStatement
				System.out.println("User name from database: ");
				if(rs.next()){
					name = rs.getString(1);
					
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return name;
	}

}
