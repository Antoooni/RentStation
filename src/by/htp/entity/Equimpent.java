package by.htp.entity;

public class Equimpent {
	private Long equipmentId;
	public Long getEquipmentId() {
		return equipmentId;
	}

	public void setEquipmentId(Long equipmentId) {
		this.equipmentId = equipmentId;
	}

	private String name;
	private double price;

	public Equimpent(Long id, String name, double price) {
		super();
		this.equipmentId=id;
		this.name = name;
		this.price = price;
	}
	public Equimpent( String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	public Equimpent(){
		
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Equimpent [name=" + name + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Equimpent other = (Equimpent) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
