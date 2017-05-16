package by.htp.Lesson7.equipment.launch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import by.htp.Lesson7.equipment.accessoriesUnit.SkiAccessories;
import by.htp.Lesson7.equipment.accessoriesUnit.SnowboardAccessories;
import by.htp.Lesson7.equipment.domain.Accessories;
import by.htp.Lesson7.equipment.domain.AccessoriesType;
import by.htp.Lesson7.equipment.domain.Category;
import by.htp.Lesson7.equipment.domain.Client;
import by.htp.Lesson7.equipment.domain.Equipment;
import by.htp.Lesson7.equipment.domain.Manager;
import by.htp.Lesson7.equipment.domain.RentUnit;
import by.htp.Lesson7.equipment.equipmentUnit.Ski;
import by.htp.Lesson7.equipment.equipmentUnit.Snowboard;
import by.htp.Lesson7.equipment.service.RentStationService;
import by.htp.Lesson7.equipment.service.RentStationServiceImpl;

public class TestRent {

	public static void main(String[] args) {
		// equipment
		Equipment eq1 = new Ski("Fisher", Category.ADULT, 25.0, false);
		Equipment eq2 = new Ski("Volkl", Category.CHILD, 30.0, false);
		Equipment eq3 = new Snowboard("Burton", Category.ADULT, 27.5, false);
		Equipment eq4 = new Snowboard("Flow", Category.ADULT, 40, false);
		Equipment eq5 = new Snowboard("Fisher", Category.CHILD, 20, false);

		// Accessories
		Accessories as1 = new SkiAccessories("Atomic", "gloves", "white", 10.0, AccessoriesType.CLOTHES, false);
		Accessories as2 = new SkiAccessories("gopro", "hero 4", "black", 25, AccessoriesType.OTHER, false);
		Accessories as3 = new SnowboardAccessories("Trespass", "no name", "green", 5, AccessoriesType.PROTECTION,
				false);

		Manager m1 = new Manager();
		m1.setNameManager("Mr.Seller");
		m1.setIdManager(1122334);

		ArrayList<RentUnit> equipments = new ArrayList<RentUnit>();
		equipments.add(eq1);
		equipments.add(eq2);
		equipments.add(eq3);
		equipments.add(eq4);
		equipments.add(eq5);
		equipments.add(as1);
		equipments.add(as2);
		equipments.add(as3);
		
		Map<Manager, List<RentUnit>> clientRentedItems = new HashMap<Manager, List<RentUnit>>();
		Client c1 = new Client();
//================================================================

		RentStationService rentStationSevice = new RentStationServiceImpl(equipments);
		System.out.println("Whole Stock: ");
		rentStationSevice.showAvailable(equipments);

		String toFindByBrand = "Fisher";

		System.out.println('\n'+"Found items with brand " + toFindByBrand + ": ");
		rentStationSevice.markFound(equipments, toFindByBrand, true);
		rentStationSevice.showRented(equipments);
		
		List<RentUnit> foundItems = new ArrayList<RentUnit>();
		foundItems = rentStationSevice.findItem(equipments, toFindByBrand, false);

		c1.setName("Anton");
		c1.setId(12345678);

		clientRentedItems.put(m1, foundItems);
		rentStationSevice.printOrder(clientRentedItems);
		
		
		//add items to client
		c1.setRentedGoods(foundItems);
		
		// all available in station after client renting
		rentStationSevice.defOfRemaining(equipments,foundItems);
		System.out.println('\n'+"All available items: ");
		rentStationSevice.showAvailable(equipments);

		

	}

}
