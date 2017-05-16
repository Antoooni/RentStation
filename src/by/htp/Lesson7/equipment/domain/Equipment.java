package by.htp.Lesson7.equipment.domain;

import java.util.Date;

public abstract class Equipment extends RentUnit {

	private String brand;
	private Category category;
	private double price;
	private boolean isRented;
	private Date pickUpDate;//until no use

	public Equipment(String brand, Category category, double price, boolean isRented) {
		this.brand = brand;
		this.category = category;
		this.price = price;
		this.isRented = isRented;
	}

	public Date getDate() {
		return pickUpDate;
	}

	public void setDate(Date pickUpDate) {
		this.pickUpDate = pickUpDate;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
//
	public double getPrice() {
		return price;
	}

	public void setHourlyPrice(double hourlyPrice) {
		this.price = hourlyPrice;
	}
//
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public boolean isRented() {
		return isRented;
	}

	public void setRented(boolean isRented) {
		this.isRented = isRented;
	}

}
