package by.htp.service;

import java.util.ArrayList;
import java.util.List;

import by.htp.entity.Equimpent;

public class EquipmentServiceImpl implements EquipmentService {

	@Override
	public List<Equimpent> list() {
		List<Equimpent> equipment= new ArrayList<Equimpent>();
		equipment.add(new Equimpent("eq1", 25));
		equipment.add(new Equimpent("eq2", 30));
		equipment.add(new Equimpent("eq3", 35));
		return equipment;
	}

}
