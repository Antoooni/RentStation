package by.htp.dao;

import static by.htp.util.ConstantValue.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import by.htp.Lesson7.equipment.domain.Category;
import by.htp.Lesson7.equipment.domain.Equipment;

public class EquipmentDaoImpl implements EquipmentDao {

	@Override
	public List<Equipment> eq() {
		ResourceBundle bundle = ResourceBundle.getBundle("config");
		String dbUrl=bundle.getString("db.url");
		String dbUser =bundle.getString("db.login");
		String dbPass=bundle.getString("db.pass");
		System.out.println(dbUrl+" "+" "+dbUser+" "+ dbPass);
		String dbName =bundle.getString("db.driver.name");
		List <Equipment> eq= new ArrayList<Equipment>();
		
		try {
			try {
				Class.forName(dbName);
				Connection connection =DriverManager.getConnection(dbUrl, dbUser, dbPass);
				PreparedStatement ps= connection.prepareStatement(SQL_STATEMENT_ALL_EQUIPMENTS);
				ResultSet rs = ps.executeQuery();
				while (rs.next()){ //цикл для всех записей из БД
					
					String brand = rs.getString(2);
					double price =Double.valueOf(rs.getString(3));
					Category category=  Category.valueOf(rs.getString(5).toUpperCase());
					eq.add(new Equipment(brand,category, price, false) {
					});
					System.out.println("brand: "+ brand+ " category: "+ category+" price "+price);
					
				}
				
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return eq;
	}

}
