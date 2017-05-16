package by.htp.Lesson7.equipment.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


import by.htp.Lesson7.equipment.domain.Manager;
import by.htp.Lesson7.equipment.domain.RentUnit;

public interface RentStationService {

	void showAvailable(List<RentUnit> wholeList);
	void showRented(List<RentUnit> wholeList);

	//RentUnit[] searchItem(String brand, boolean isRented);
	List<RentUnit> findItem(List<RentUnit> wholeList, String brand, boolean isRented);

	List<RentUnit> defOfRemaining(List<RentUnit> wholeList, List<RentUnit> foundItems);
	List<RentUnit> markFound(List<RentUnit> wholeList, String brand, boolean isRented);
	void printOrder(Map<Manager, List<RentUnit>> clientRentedItems);


	

	//void show();

}
