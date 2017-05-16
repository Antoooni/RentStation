package by.htp.Lesson7.equipment.launch;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import by.htp.Lesson7.equipment.domain.RentUnit;
import by.htp.Lesson7.equipment.service.RentStationService;
import by.htp.Lesson7.equipment.service.RentStationServiceImpl;
import by.htp.Lesson7.parsers.service.ParserDOMServiceImpl;

public class TestRentUsingDOM {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		//// DOM - parser
		ParserDOMServiceImpl parserService = new ParserDOMServiceImpl();
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
