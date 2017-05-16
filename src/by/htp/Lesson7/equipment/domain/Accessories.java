package by.htp.Lesson7.equipment.domain;

import java.util.Date;

public abstract class Accessories extends RentUnit {
	private String brand;
	private String name;
	private String color;
	private double price;
	private AccessoriesType type;
	boolean isRented;
	private Date pickUpDate;// until no use

	public Accessories(String brand, String name, String color, double price, AccessoriesType type, boolean isRented) {
		this.color = color;
		this.brand = brand;
		this.name = name;
		this.price = price;
		this.type = type;
		this.isRented = isRented;
	}

	public Date getPickUpDate() {
		return pickUpDate;
	}

	public void setPickUpDate(Date pickUpDate) {
		this.pickUpDate = pickUpDate;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public AccessoriesType getType() {
		return type;
	}

	public void setType(AccessoriesType type) {
		this.type = type;
	}

}
