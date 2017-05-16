package by.htp.Lesson7.parsers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import by.htp.Lesson7.equipment.accessoriesUnit.SkiAccessories;
import by.htp.Lesson7.equipment.accessoriesUnit.SnowboardAccessories;
import by.htp.Lesson7.equipment.domain.AccessoriesType;
import by.htp.Lesson7.equipment.domain.Category;
import by.htp.Lesson7.equipment.domain.Manager;
import by.htp.Lesson7.equipment.domain.RentUnit;
import by.htp.Lesson7.equipment.equipmentUnit.Ski;
import by.htp.Lesson7.equipment.equipmentUnit.Snowboard;

public class HandlerSAX extends DefaultHandler {

	private String brand;
	private int ManagerID;
	private String ManagerName;
	private String name;
	private String colour;
	private Category category;
	private double price;
	private boolean isRented;
	private AccessoriesType type;

	private String element;
	private List<RentUnit> equipments;

	public List<RentUnit> getEquipments() {
		return equipments;
	}

	Manager m1;
	Map<Manager, List<RentUnit>> clientRentedItems;

	public Map<Manager, List<RentUnit>> getClientRentedItems() {
		return clientRentedItems;
	}

//	@Override
//	public void startDocument() throws SAXException {
//		System.out.println("Start parsing...");
//	}

//	@Override
//	public void endDocument() throws SAXException {
//		System.out.println("End parsing.");
//	}

	@Override
	public void startElement(String nameSpace, String localName, String qName, Attributes attributes)
			throws SAXException {
		element = qName; 
		switch (element) {
		case "RentUnits": {
			equipments = new ArrayList<RentUnit>();
		}
			break;
		case "Managers": {
			m1 = new Manager();
		}
			break;
		case "Ski": {
			isRented = Boolean.parseBoolean(attributes.getValue(0));
		}
			break;
		case "Manager": {
			ManagerID = Integer.parseInt(attributes.getValue(0));
			ManagerName = attributes.getValue(1);
		}
			break;
		case "RentStation": {
			clientRentedItems = new HashMap<Manager, List<RentUnit>>();
		}
			break;
		}

	}

	@Override
	public void endElement(String nameSpace, String localName, String qName) throws SAXException {
		switch (qName) {
		case "Ski": {
			equipments.add(new Ski(brand, category, price, isRented));
		}
			break;
		case "Snowboard": {
			equipments.add(new Snowboard(brand, category, price, isRented));
		}
			break;
		case "SkiAccessorise": {
			equipments.add(new SkiAccessories(brand, colour, name, price, type, isRented));
		}
			break;
		case "SnowboardAccessorise": {
			equipments.add(new SnowboardAccessories(brand, colour, name, price, type, isRented));
		}
			break;
		case "Managers": {
			m1.setIdManager(ManagerID);
			m1.setNameManager(ManagerName);
		}
			break;
		case "RentStation": {
			clientRentedItems.put(m1, equipments);
		}
		}

		element = "";
	}

	@Override
	public void characters(char[] ch, int start, int end) throws SAXException {
		switch (element) {
		case "Brand": {
			brand = new String(ch, start, end);
		}
			break;
		case "Category": {
			String str = new String(ch, start, end);
			definEquipmentCategory(str);// definition category of equipment
		}
			break;
		case "Type": {
			String str = new String(ch, start, end);
			definAccessoriseType(str);// definition type of accessorise
		}
			break;
		case "Price": {
			price = Double.parseDouble(new String(ch, start, end));
		}
			break;
		case "Name": {
			name = new String(ch, start, end);
		}
			break;
		case "Colour": {
			colour = new String(ch, start, end);
		}
			break;
		}
	}

	public void definEquipmentCategory(String str) {
		if (str.equals(Category.ADULT.toString())) {
			category = Category.ADULT;
		} else if (str.equals(Category.CHILD.toString())) {
			category = Category.CHILD;
		}
	}

	public void definAccessoriseType(String str) {
		if (str.equals(AccessoriesType.CLOTHES.toString())) {
			type = AccessoriesType.CLOTHES;
		} else if (str.equals(AccessoriesType.OTHER.toString())) {
			type = AccessoriesType.OTHER;
		} else if (str.equals(AccessoriesType.PROTECTION.toString())) {
			type = AccessoriesType.PROTECTION;
		}
	}

}
