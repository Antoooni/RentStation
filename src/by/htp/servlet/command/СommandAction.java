package by.htp.servlet.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface �ommandAction {
	public String execute(HttpServletRequest request, HttpServletResponse response);
}
