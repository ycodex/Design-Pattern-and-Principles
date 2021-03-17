public class DBConn {
	private static DBConn instance = new DBConn();
	
	private DBConn(){}
	
	public static DBConn getInstance() {
		System.out.println("Instance");
		return instance;
	}
}
