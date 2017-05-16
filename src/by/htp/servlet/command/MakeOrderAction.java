package by.htp.servlet.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static by.htp.util.ConstantValue.*;

public class MakeOrderAction implements ÑommandAction {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return PAGE_ORDER_CREATE;
	}

}
