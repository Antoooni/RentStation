package by.htp.Lesson7.equipment.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import by.htp.Lesson7.equipment.domain.Category;
import by.htp.Lesson7.equipment.domain.Manager;
import by.htp.Lesson7.equipment.domain.RentStation;
import by.htp.Lesson7.equipment.domain.RentUnit;

public class RentStationServiceImpl implements RentStationService {
	private RentStation station;

	public RentStationServiceImpl(Manager stock) {
		super();
		this.station = stock;
	}

	public RentStationServiceImpl(List<RentUnit> wholeList) {
		// TODO Auto-generated constructor stub
	}

	// public RentStationServiceImpl(RentStation stock) {
	// this.station = stock;
	// }
	@Override
	public void showAvailable(List<RentUnit> wholeList) {
		// TODO Auto-generated method stub
		if (wholeList != null) {
			for (RentUnit e : wholeList) {
				if (e.isRented() == false) {
					System.out.print("RentUnit: " + e.getBrand() + " price " + e.getPrice() + "$ from category ");
					if (e.getCategory() instanceof Category) {
						System.out.println(e.getCategory());
					} else {
						System.out.println(e.getType());
					}
				}

			}
		}
	}

	@Override
	public void showRented(List<RentUnit> wholeList) {
		// TODO Auto-generated method stub
		if (wholeList != null) {
			for (RentUnit e : wholeList) {
				if (e.isRented() == true) {
					System.out.print("RentUnit: " + e.getBrand() + " price " + e.getPrice() + "$ from category ");
					if (e.getCategory() instanceof Category) {
						System.out.println(e.getCategory());
					} else {
						System.out.println(e.getType());
					}
				}

			}
		}
	}

	@Override
	public String toString() {
		return "RentStationServiceImpl [station=" + station + "]";
	}

	@Override
	public List<RentUnit> findItem(List<RentUnit> wholeList, String brand, boolean isRented) {
		List<RentUnit> found = new ArrayList<RentUnit>();
		for (RentUnit e : wholeList) {
			if (brand.equals(e.getBrand())) {
				found.add(e);
			}
		}
		return found;
	}

	@Override
	public List<RentUnit> markFound(List<RentUnit> wholeList, String brand, boolean isRented) {
		for (RentUnit e : wholeList) {
			if (brand.equals(e.getBrand())) {
				e.setRented(isRented);
			}
		}
		return wholeList;
	}

	@Override
	public List<RentUnit> defOfRemaining(List<RentUnit> wholeList, List<RentUnit> foundItems) {
		// all available after client renting
		Iterator<RentUnit> iter = wholeList.iterator();
		while (iter.hasNext()) {
			RentUnit s = iter.next();
			for (RentUnit i : foundItems) {
				if (s.equals(i)) {
					iter.remove();
				}

			}
		}
		return wholeList;

	}

	@Override
	public void printOrder(Map<Manager, List<RentUnit>> clientRentedItems) {
		for (Manager key : clientRentedItems.keySet()) {
			System.out.println('\n'+"Client : " + key.getNameManager() + " rented: " + clientRentedItems.get(key));
			System.out.println("Tatal: ");
		}
		
	}

}
