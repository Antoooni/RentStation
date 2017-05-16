package by.htp.Lesson7.parsers.service;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import by.htp.Lesson7.equipment.domain.Manager;
import by.htp.Lesson7.equipment.domain.RentUnit;

public interface ParserDOMService {
	public Map<Manager, List<RentUnit>> getAllData() throws ParserConfigurationException, SAXException, IOException;
}
