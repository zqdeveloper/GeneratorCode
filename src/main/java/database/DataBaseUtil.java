package database;

public class DataBaseUtil {
	private static DataBaseUtil instance = new DataBaseUtil();
	private DataBaseUtil() {
		
	}
	public static DataBaseUtil getInstance() {
		return instance;
	}
}
