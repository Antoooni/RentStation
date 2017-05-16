package by.htp.dao;

import static by.htp.util.ConstantValue.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;

import by.htp.entity.Order;
import by.htp.entity.User;

public class OrderDaoImpl implements OrderDao {

	@Override
	public boolean createOrder(Order order) {
		ResourceBundle bundle = ResourceBundle.getBundle("config");
		String dbUrl=bundle.getString("db.url");
		String dbUser =bundle.getString("db.login");
		String dbPass=bundle.getString("db.pass");
		System.out.println(dbUrl+" "+" "+dbUser+" "+ dbPass);
		String dbName =bundle.getString("db.driver.name");
		// TODO Auto-generated method stub
		try {
			try {
				Class.forName(dbName);
				Connection connection =DriverManager.getConnection(dbUrl, dbUser, dbPass);
				//Statement st = connection.createStatement(); //через Statement отправляется запрос в sql
				//ResultSet rs =st.executeQuery(SQL_STATEMENT_ONE_USER); //небезопасный способ
				PreparedStatement ps= connection.prepareStatement(SQL_STATEMENT_ORDER_CREATE, PreparedStatement.RETURN_GENERATED_KEYS);
//				ps.setString(1, login); // код для PreparedStatement
//				ps.setString(2, password); // код для PreparedStatement
				ps.setLong(1, order.getUser().getUserId());
				ps.setLong(2, order.getEquipment().getEquipmentId());
				ps.setDate(3, order.getDatStart());
				ps.setDate(4, order.getDatEnd());
				
				 int id= ps.RETURN_GENERATED_KEYS;
				ps.executeUpdate(); 
				
				
				System.out.println("Data from database: ");
				
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//return null;
		
		return false;
	}

	@Override
	public List<Order> fetchAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
