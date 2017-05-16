package by.htp.Lesson7.equipment.domain;

import java.util.ArrayList;
import java.util.List;

public class Client {
	private String name;
	private int id;
	private List<RentUnit> rentedGoods;
	//final ArrayList<RentUnit> rentedClientGoods = new  ArrayList<RentUnit>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	 public List<RentUnit> getRentedGoods() {
		return rentedGoods;
	}

	public void setRentedGoods(List<RentUnit> rentedGoods) {
		this.rentedGoods = rentedGoods;
	}

//	public ArrayList<RentUnit> getRentedClientGoods() {
//		return rentedClientGoods;
//	}

	

	

}
