package by.htp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;



import by.htp.entity.User;

import static by.htp.util.ConstantValue.*;

public class UserDaoImpl implements UserDao {

	@Override
	public User fetchByCredentials(String login, String password) {
		ResourceBundle bundle = ResourceBundle.getBundle("config");
		String dbUrl=bundle.getString("db.url");
		String dbUser =bundle.getString("db.login");
		String dbPass=bundle.getString("db.pass");
		System.out.println(dbUrl+" "+" "+dbUser+" "+ dbPass);
		String dbName =bundle.getString("db.driver.name");
		
		User user= null;
		
		
		try {
			try {
				Class.forName(dbName);
				Connection connection =DriverManager.getConnection(dbUrl, dbUser, dbPass);
				//Statement st = connection.createStatement(); //через Statement отправляется запрос в sql
				//ResultSet rs =st.executeQuery(SQL_STATEMENT_ONE_USER); //небезопасный способ
				PreparedStatement ps= connection.prepareStatement(SQL_STATEMENT_ONE_USER);
				ps.setString(1, login); // код для PreparedStatement
				ps.setString(2, password); // код для PreparedStatement
				ResultSet rs = ps.executeQuery(); // код для PreparedStatement
				
				
				System.out.println("Data from database: ");
				if(rs.next()){
					String log = rs.getString(2);
					String pass=  rs.getString(3);
					boolean role = rs.getBoolean(5);
					
					user = new User();
					user.setLogin(log);
					user.setPassword(pass);
					user.setRole(role);
				}
//				while (rs.next()){ //цикл для всех записей из БД
//					String log = rs.getString(2);
//					String pass=  rs.getString(3);
//					System.out.println("Login: "+ log+ " Password: "+ pass);
//				}
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//return null;
		return user;
	}

}
