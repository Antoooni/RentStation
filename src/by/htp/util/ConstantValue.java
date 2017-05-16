package by.htp.util;

public final class ConstantValue {
	
	private ConstantValue(){
		
	}
	public static final String ACTION_AUTHORISE="login";
	public static final String ACTION_MAKE_ORDER="create_order";
	public static final String ACTION_ORDER="make_order";
	
	
	public static final String PAGE_ADMIN_NAME = "/admin.jsp";
	public static final String PAGE_USER_NAME = "/user.jsp"; //"/equipment.jsp"
	public static final String PAGE_ERROR = "/error.jsp";
	public static final String PAGE_DEFAULT = "/index.html"; //"/index1.html"
	
	public static final String PAGE_ORDER_ALL = "/orders.jsp";
	public static final String PAGE_ORDER_CREATE = "/order.jsp";
	
	
	public static final String REQUEST_PARAM_ACTION  ="";
	public static final String REQUEST_PARAM_AUTHORISE = "";
	public static final String REQUEST_PARAM_LOGIN = "login";
	public static final String REQUEST_PARAM_PASSWORD = "pass";
	public static final String REQUEST_PARAM_LIST_EQ = "list_eq";
	
	public static final String PARAM_USER_ID="user_id";
	public static final String PARAM_EQUIPMENT_ID="equipment_id";
	public static final String PARAM_DATE_START="date_start";
	public static final String PARAM_DATE_END="date_end";
	
	public static final String REQUEST_PARAM_ERROR_MSG = "errog_msg";
	public static final String SQL_STATEMENT_SELECT_USERS = "select* from user";
	public static final String SQL_STATEMENT_ONE_USER="select * from user where login = ? and password = ?;";
	public static final String SQL_STATEMENT_ORDER_CREATE="INSERT INTO sport1.order (id_user, id_equipment, date_start, date_end) VALUES (?, ?, ?, ?);";
}
