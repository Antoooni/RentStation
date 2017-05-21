package by.htp.service;

import java.util.List;

import by.htp.Lesson7.equipment.domain.Accessories;
import by.htp.Lesson7.equipment.domain.Equipment;



public interface EquipmentService {

	List <Equipment> listEq();
	List <Accessories> listAc();
	String userData(String login, String password);

}
