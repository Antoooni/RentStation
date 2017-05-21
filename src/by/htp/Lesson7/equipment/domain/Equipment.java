package by.htp.Lesson7.equipment.domain;

import java.util.Date;

public abstract class Equipment extends RentUnit {

	private String brand;
	private Category category;
	private double price;
	private boolean isRented;
	private Date pickUpDate;//until no use

	public Equipment(){
		
	}

	public Equipment(String brand, Category category, double price, boolean isRented) {
		super();
		this.brand = brand;
		this.category = category;
		this.price = price;
		this.isRented = isRented;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + (isRented ? 1231 : 1237);
		result = prime * result + ((pickUpDate == null) ? 0 : pickUpDate.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipment other = (Equipment) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (category != other.category)
			return false;
		if (isRented != other.isRented)
			return false;
		if (pickUpDate == null) {
			if (other.pickUpDate != null)
				return false;
		} else if (!pickUpDate.equals(other.pickUpDate))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Equipment [brand=" + brand + ", category=" + category + ", price=" + price + ", isRented=" + isRented
				+ ", pickUpDate=" + pickUpDate + "]";
	}

	public Date getPickUpDate() {
		return pickUpDate;
	}

	public void setPickUpDate(Date pickUpDate) {
		this.pickUpDate = pickUpDate;
	}

	public void setPrice(double price) {
		this.price = price;
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
