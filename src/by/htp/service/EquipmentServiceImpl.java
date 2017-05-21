package by.htp.service;

import java.util.List;

import by.htp.Lesson7.equipment.domain.Accessories;
import by.htp.Lesson7.equipment.domain.Equipment;
import by.htp.dao.AccessoriesDao;
import by.htp.dao.AccessoriesDaoImpl;
import by.htp.dao.EquipmentDao;
import by.htp.dao.EquipmentDaoImpl;
import by.htp.dao.UserNameDao;
import by.htp.dao.UserNameDaoImpl;



public class EquipmentServiceImpl implements EquipmentService {
	private EquipmentDao daoEq;
	private AccessoriesDao daoAc;
	private UserNameDao daoNme;
	
	
	public EquipmentServiceImpl(){
		daoEq = new EquipmentDaoImpl();
		daoAc = new AccessoriesDaoImpl();
		daoNme=new UserNameDaoImpl();
	}
	

	@Override
	public List<Equipment> listEq() {
		List<Equipment> equipment = daoEq.eq();
		return equipment;
	}

	@Override
	public List<Accessories> listAc() {
		List <Accessories> accessories = daoAc.acc();
		return accessories;
	}


	@Override
	public String userData(String login, String password) {
		String name = daoNme.getUserName(login, password);
		return name;
	}

}
