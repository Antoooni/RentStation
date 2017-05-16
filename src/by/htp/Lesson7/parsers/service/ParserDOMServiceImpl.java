package by.htp.Lesson7.parsers.service;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import by.htp.Lesson7.equipment.domain.Manager;
import by.htp.Lesson7.equipment.domain.RentUnit;
import by.htp.Lesson7.parsers.HandlerDOM;

public class ParserDOMServiceImpl implements ParserDOMService {
	HandlerDOM handlerDom = new HandlerDOM();

	public Map<Manager, List<RentUnit>> getAllData() throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = factory.newDocumentBuilder();
		Document doc = documentBuilder.parse(new File("C:/Users/ayumazec/workspace_IT_Academy -NEW/Lesson16EquipmentWeb/source/RentStation.xml"));
		handlerDom.startProcess(doc);
		
		return handlerDom.getClientRentedItems();
	}

	public List<RentUnit> getEquipment() {
		return handlerDom.getEquipments();
	}

}
