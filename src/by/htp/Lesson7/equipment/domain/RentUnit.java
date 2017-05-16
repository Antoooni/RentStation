package by.htp.Lesson7.equipment.domain;

import java.util.Date;

public abstract class RentUnit {
	private static int MAXITEMS = 3;//не учитываем аксесуары, не более 3-х equipment & unlimited accessories 

	private Category category;
	private AccessoriesType type;
	private double price;
	private String brand;
	private boolean isRented;
	private Date pickUpDate;

	public Date getPickUpDate() {
		return pickUpDate;
	}

	public void setPickUpDate(Date pickUpDate) {
		this.pickUpDate = pickUpDate;
	}

	public AccessoriesType getType() {
		return type;
	}

	public void setType(AccessoriesType type) {
		this.type = type;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setHourlyPrice(double price) {
		this.price = price;
	}

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

	public static int getMAXITEMS() {
		return MAXITEMS;
	}

	public static void setMAXITEMS(int maxitems) {
		MAXITEMS = maxitems;
	}
}
