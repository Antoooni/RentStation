package by.htp.Lesson7.parsers.service;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import by.htp.Lesson7.equipment.domain.Manager;
import by.htp.Lesson7.equipment.domain.RentUnit;
import by.htp.Lesson7.parsers.HandlerSAX;

public class ParserSAXServiceImpl implements ParserSAXService {
	HandlerSAX handler = new HandlerSAX();

	public Map<Manager, List<RentUnit>> getAllData() {
		SAXParserFactory parserF = SAXParserFactory.newInstance();
		try {
			SAXParser saxparser = parserF.newSAXParser();

			saxparser.parse(
					new File("C:/Users/ayumazec/workspace_IT_Academy -NEW/Lesson16EquipmentWeb/source/RentStation.xml"),
					handler);
		} catch (ParserConfigurationException | SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return handler.getClientRentedItems();
	}

	public List<RentUnit> getEquipment(){
		return handler.getEquipments();
	}
}
