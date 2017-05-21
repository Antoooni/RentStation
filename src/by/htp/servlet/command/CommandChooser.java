package by.htp.servlet.command;
import static by.htp.util.ConstantValue.*;

public class CommandChooser {
	

	public static —ommandAction chooseAction(String action) {
		switch (action) {
		case ACTION_AUTHORISE:
			System.out.println("Login action: " + action);
			return new LoginCommandAction();
		case ACTION_MAKE_ORDER:
			System.out.println("createOrder action: " + action);
			return new OrderCreateAction();
		case ACTION_ORDER:
			System.out.println("makeOrder action: " + action);
			return new MakeOrderAction();
		case ACTION_GO_HOME:
			System.out.println("Go home page action: " + action);
			return new GoHomeAction();
		}
		return null;// stub Á‡„ÎÛ¯Í‡
	}
}
