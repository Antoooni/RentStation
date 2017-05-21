package by.htp.util;

public final class ConstantValue {
	
	private ConstantValue(){
		
	}
	public static final String ACTION_AUTHORISE="login";
	public static final String ACTION_MAKE_ORDER="create_order";
	public static final String ACTION_ORDER="make_order";
	public static final String ACTION_GO_HOME = "go_home";
	
	
	public static final String PAGE_ADMIN_NAME = "/admin.jsp";
	public static final String PAGE_USER_NAME = "/user.jsp"; //"/equipment.jsp"
	public static final String PAGE_ERROR = "/error.jsp";
	public static final String PAGE_DEFAULT = "/index.html"; //"/index1.html"
	public static final String PAGE_ORDER_COMPLETED = "/order_done.jsp";
	
	public static final String PAGE_ORDER_ALL = "/orders.jsp";
	public static final String PAGE_ORDER_CREATE = "/order.jsp";
	
	
	public static final String REQUEST_PARAM_ACTION  ="";
	public static final String REQUEST_PARAM_AUTHORISE = "";
	public static final String REQUEST_PARAM_LOGIN = "login";
	public static final String REQUEST_PARAM_PASSWORD = "pass";
	public static final String REQUEST_PARAM_LIST_EQUIPMENT = "list_eq";
	public static final String REQUEST_PARAM_LIST_ACCCESSORIES = "list_ac";
	public static final String REQUEST_PARAM_USER_NAME ="user_name";
	
	
	public static final String PARAM_BASKET_ID="basket_id";
	public static final String PARAM_USER_ID="user_id";
	public static final String PARAM_UID="uid";
	public static final String PARAM_DATE_START="date_start";
	
	public static final String REQUEST_PARAM_ERROR_MSG = "errog_msg";
	public static final String SQL_STATEMENT_SELECT_USERS = "select* from user";
	public static final String SQL_STATEMENT_ONE_USER="select * from authorisation where login = ? and password = ?; ";
	public static final String SQL_STATEMENT_USER_NAME="select name from user join authorisation on user.user_id=authorisation.user_id where authorisation.login = ? and authorisation.password=?; ";
	public static final String SQL_STATEMENT_ORDER_CREATE="INSERT INTO rent_station.order (basket_id, user_id, UID, pickUpDate) VALUES (?, ?, ?, ?);";
	
	public static final String SQL_STATEMENT_ALL_EQUIPMENTS ="select type_unit.type_unit_value, rent_unit.brand, rent_unit.price, equipment.equipment_type, equipment.category from rent_unit left join equipment on rent_unit.rent_unit_id=equipment.equipment_id left join type_unit on rent_unit.type_unit_id =type_unit.type_unit_id where type_unit.type_unit_id = '1'";
	public static final String SQL_STATEMENT_ALL_ACCESSORIES="select type_unit.type_unit_value, rent_unit.brand, rent_unit.price,  accessories.name, accessories.`type` from rent_unit  left join accessories on rent_unit.rent_unit_id=accessories.accessories_id left join type_unit on rent_unit.type_unit_id =type_unit.type_unit_id where type_unit.type_unit_id =2";
}
