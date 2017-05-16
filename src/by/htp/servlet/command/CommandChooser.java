package by.htp.servlet.command;
import static by.htp.util.ConstantValue.*;

public class CommandChooser {
	public static —ommandAction chooseAction(String action) {
		switch (action) {
		case "login":
			System.out.println("Login action: " + action);
			return new LoginCommandAction();
		case "create_order":
			System.out.println("createOrder action: " + action);
			return new OrderCreateAction();
		case ACTION_ORDER:
			System.out.println("makeOrder action: " + action);
			return new MakeOrderAction();
		}
		return null;// stub Á‡„ÎÛ¯Í‡
	}
}
