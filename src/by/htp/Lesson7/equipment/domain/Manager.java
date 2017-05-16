package by.htp.Lesson7.equipment.domain;

import by.htp.Lesson7.equipment.domain.RentStation;

public class Manager extends RentStation {

	private String nameManager;
	private int idManager;

	public String getNameManager() {
		return nameManager;
	}

	public void setNameManager(String nameManager) {
		this.nameManager = nameManager;
	}

	public int getIdManager() {
		return idManager;
	}

	public void setIdManager(int idManager) {
		this.idManager = idManager;
	}

}
