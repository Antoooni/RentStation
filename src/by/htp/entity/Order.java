package by.htp.entity;

import java.sql.Date;



public class Order {
	private Long order_id;
	private User user;
	private Equimpent equipment;
	private Date dateStart;
	private Date dateEnd;
	
	public Order(Long order_id, User user, Equimpent equipment, Date datStart, Date datEnd) {
		super();
		this.order_id = order_id;
		this.user = user;
		this.equipment = equipment;
		this.dateStart = datStart;
		this.dateEnd = datEnd;
	}
	public Order() {
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateEnd == null) ? 0 : dateEnd.hashCode());
		result = prime * result + ((dateStart == null) ? 0 : dateStart.hashCode());
		result = prime * result + ((equipment == null) ? 0 : equipment.hashCode());
		result = prime * result + ((order_id == null) ? 0 : order_id.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		Order other = (Order) obj;
		if (dateEnd == null) {
			if (other.dateEnd != null)
				return false;
		} else if (!dateEnd.equals(other.dateEnd))
			return false;
		if (dateStart == null) {
			if (other.dateStart != null)
				return false;
		} else if (!dateStart.equals(other.dateStart))
			return false;
		if (equipment == null) {
			if (other.equipment != null)
				return false;
		} else if (!equipment.equals(other.equipment))
			return false;
		if (order_id == null) {
			if (other.order_id != null)
				return false;
		} else if (!order_id.equals(other.order_id))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}
	public Long getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Long order_id) {
		this.order_id = order_id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Equimpent getEquipment() {
		return equipment;
	}
	public void setEquipment(Equimpent equipment) {
		this.equipment = equipment;
	}
	public Date getDatStart() {
		return dateStart;
	}
	public void setDatStart(Date datStart) {
		this.dateStart = datStart;
	}
	public Date getDatEnd() {
		return dateEnd;
	}
	public void setDatEnd(Date datEnd) {
		this.dateEnd = datEnd;
	}
}
