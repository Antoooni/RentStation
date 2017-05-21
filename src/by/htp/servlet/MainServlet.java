package by.htp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import by.htp.servlet.command.CommandChooser;
import by.htp.servlet.command.—ommandAction;

public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 9073662222614280998L;

	public MainServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
		System.out.println("do GET");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response); //ÔÓÍ‡ Á‡ÍÓÏÏÂÌ˜ÂÌ‡
		System.out.println("do POST");

	}

	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		String page=null;
		if(action!=null){
			—ommandAction currentAction = CommandChooser.chooseAction(action);
			page = currentAction.execute(request, response);
			RequestDispatcher disp = request.getRequestDispatcher(page);
			disp.forward(request, response);
		}
		 

	}

}
