package by.htp.Lesson7.equipment.launch;

import java.util.ArrayList;
import java.util.List;

import by.htp.Lesson7.equipment.domain.RentUnit;
import by.htp.Lesson7.equipment.service.RentStationService;
import by.htp.Lesson7.equipment.service.RentStationServiceImpl;
import by.htp.Lesson7.parsers.service.ParserSAXServiceImpl;

public class TestRentUsingSAX {

	public static void main(String[] args) {

		// SAX - parser
		ParserSAXServiceImpl parserService = new ParserSAXServiceImpl();
		parserService.getAllData();
		
		// all other services
		RentStationService rentStationSevice = new RentStationServiceImpl(parserService.getEquipment());
		System.out.println("Whole Stock: ");
		rentStationSevice.showAvailable(parserService.getEquipment());

		String toFindByBrand = "Fisher";

		System.out.println('\n' + "Found items with brand " + toFindByBrand + ": ");
		rentStationSevice.markFound(parserService.getEquipment(), toFindByBrand, true);
		rentStationSevice.showRented(parserService.getEquipment());

		List<RentUnit> foundItems = new ArrayList<RentUnit>();
		foundItems = rentStationSevice.findItem(parserService.getEquipment(), toFindByBrand, false);

		// all available in station after client renting
		rentStationSevice.defOfRemaining(parserService.getEquipment(), foundItems);
		System.out.println('\n' + "All available items after rent: ");
		rentStationSevice.showAvailable(parserService.getEquipment());

	}

}
