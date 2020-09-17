package database;

import java.sql.Connection;
import java.sql.Statement;

public interface DataBaseManager {
	public Connection getConnection();
 	public Statement createStatement(Connection connection);
 	
}
