package by.htp.Lesson7.parsers;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import by.htp.Lesson7.equipment.accessoriesUnit.SkiAccessories;
import by.htp.Lesson7.equipment.accessoriesUnit.SnowboardAccessories;
import by.htp.Lesson7.equipment.domain.AccessoriesType;
import by.htp.Lesson7.equipment.domain.Category;
import by.htp.Lesson7.equipment.domain.Manager;
import by.htp.Lesson7.equipment.domain.RentUnit;
import by.htp.Lesson7.equipment.equipmentUnit.Ski;
import by.htp.Lesson7.equipment.equipmentUnit.Snowboard;

public class HandlerDOM {
	private String brand;
	private int ManagerID;
	private String ManagerName;
	private String name;
	private String colour;
	private Category category;
	private double price;
	private boolean isRented;
	private AccessoriesType type;
	private List<RentUnit> equipments;

	public List<RentUnit> getEquipments() {
		return equipments;
	}

	Manager m1;
	Map<Manager, List<RentUnit>> clientRentedItems;

	public Map<Manager, List<RentUnit>> getClientRentedItems() {
		return clientRentedItems;
	}

	/// -------
	public void startProcess(Document doc) {
		String root = doc.getDocumentElement().getNodeName();// get root element
		System.out.println(root);

		// Manager
		m1 = new Manager();
		NodeList nodeList = doc.getElementsByTagName("Manager");
		for (int i = 0; i < nodeList.getLength(); i++) {
			Element element = (Element) nodeList.item(i);
			ManagerID = Integer.parseInt(element.getAttributes().getNamedItem("ManagerID").getNodeValue());
			ManagerName = element.getAttributes().getNamedItem("ManagerName").getNodeValue();
			m1.setIdManager(ManagerID);
			m1.setNameManager(ManagerName);
		}

		// ===========Add all Ski
		nodeList = doc.getElementsByTagName("Ski");
		equipments = new ArrayList<RentUnit>();
		for (int i = 0; i < nodeList.getLength(); i++) {
			Element element = (Element) nodeList.item(i);
			brand = element.getElementsByTagName("Brand").item(0).getChildNodes().item(0).getNodeValue();
			price = Double
					.parseDouble(element.getElementsByTagName("Price").item(0).getChildNodes().item(0).getNodeValue());
			isRented = Boolean.parseBoolean(element.getAttributes().getNamedItem("isRented").getNodeValue());
			{// logical block of Category definition
				String str;
				str = element.getElementsByTagName("Category").item(0).getChildNodes().item(0).getNodeValue();
				definEquipmentCategory(str);
			}
			equipments.add(new Ski(brand, category, price, isRented));
		}
		// ===========Add all Snowboard
		nodeList = doc.getElementsByTagName("Snowboard");
		for (int i = 0; i < nodeList.getLength(); i++) {
			Element element = (Element) nodeList.item(i);
			brand = element.getElementsByTagName("Brand").item(0).getChildNodes().item(0).getNodeValue();
			price = Double
					.parseDouble(element.getElementsByTagName("Price").item(0).getChildNodes().item(0).getNodeValue());
			isRented = Boolean.parseBoolean(element.getAttributes().getNamedItem("isRented").getNodeValue());
			{// logical block of Category definition
				String str = element.getElementsByTagName("Category").item(0).getChildNodes().item(0).getNodeValue();
				definEquipmentCategory(str);
			}
			equipments.add(new Snowboard(brand, category, price, isRented));
		}
		// ===========Add all SkiAccessories
		nodeList = doc.getElementsByTagName("SkiAccessorise");
		for (int i = 0; i < nodeList.getLength(); i++) {
			Element element = (Element) nodeList.item(i);
			brand = element.getElementsByTagName("Brand").item(0).getChildNodes().item(0).getNodeValue();
			name = element.getElementsByTagName("Name").item(0).getChildNodes().item(0).getNodeValue();
			colour = element.getElementsByTagName("Colour").item(0).getChildNodes().item(0).getNodeValue();
			price = Double
					.parseDouble(element.getElementsByTagName("Price").item(0).getChildNodes().item(0).getNodeValue());
			isRented = Boolean.parseBoolean(element.getAttributes().getNamedItem("isRented").getNodeValue());
			{// logical block of Accessorise type definition
				String str = element.getElementsByTagName("Type").item(0).getChildNodes().item(0).getNodeValue();
				definAccessoriseType(str);
			}
			equipments.add(new SkiAccessories(colour, brand, name, price, type, isRented));
		}
		// ===========Add all SnowboardAccessories
		nodeList = doc.getElementsByTagName("SnowboardAccessorise");
		for (int i = 0; i < nodeList.getLength(); i++) {
			Element element = (Element) nodeList.item(i);
			brand = element.getElementsByTagName("Brand").item(0).getChildNodes().item(0).getNodeValue();
			name = element.getElementsByTagName("Name").item(0).getChildNodes().item(0).getNodeValue();
			colour = element.getElementsByTagName("Colour").item(0).getChildNodes().item(0).getNodeValue();
			price = Double
					.parseDouble(element.getElementsByTagName("Price").item(0).getChildNodes().item(0).getNodeValue());
			isRented = Boolean.parseBoolean(element.getAttributes().getNamedItem("isRented").getNodeValue());
			{// logical block of Accessorise type definition
				String str = element.getElementsByTagName("Type").item(0).getChildNodes().item(0).getNodeValue();
				definAccessoriseType(str);
			}
			equipments.add(new SnowboardAccessories(colour, brand, name, price, type, isRented));
		}
		// Map
		//nodeList = doc.getElementsByTagName("RentStation");
		clientRentedItems = new HashMap<Manager, List<RentUnit>>();		
		clientRentedItems.put(m1, equipments);
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
