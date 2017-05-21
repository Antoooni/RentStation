package by.htp.Lesson7.equipment.domain;

import java.sql.Date;

public class Order {
	private Long order_id;
	private int basketId;
	private User user;
	private String uid;
	private Date pickUpDate;

	public Order() {

	}

	public Order(Long order_id, int basketId, User user, String uid, Date pickUpDate) {
		super();
		this.order_id = order_id;
		this.basketId = basketId;
		this.user = user;
		this.uid = uid;
		this.pickUpDate = pickUpDate;
	}

	public Long getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Long order_id) {
		this.order_id = order_id;
	}

	public int getBasketId() {
		return basketId;
	}

	public void setBasketId(int basketId) {
		this.basketId = basketId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public Date getPickUpDate() {
		return pickUpDate;
	}

	public void setPickUpDate(Date pickUpDate) {
		this.pickUpDate = pickUpDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + basketId;
		result = prime * result + ((order_id == null) ? 0 : order_id.hashCode());
		result = prime * result + ((pickUpDate == null) ? 0 : pickUpDate.hashCode());
		result = prime * result + ((uid == null) ? 0 : uid.hashCode());
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
		if (basketId != other.basketId)
			return false;
		if (order_id == null) {
			if (other.order_id != null)
				return false;
		} else if (!order_id.equals(other.order_id))
			return false;
		if (pickUpDate == null) {
			if (other.pickUpDate != null)
				return false;
		} else if (!pickUpDate.equals(other.pickUpDate))
			return false;
		if (uid == null) {
			if (other.uid != null)
				return false;
		} else if (!uid.equals(other.uid))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Order [order_id=" + order_id + ", basketId=" + basketId + ", user=" + user + ", uid=" + uid
				+ ", pickUpDate=" + pickUpDate + "]";
	}

}
