package es.eoi.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BBDDUtil {

	public static final String USER = "root";
	public static final String PASS = "Ellamboaventadorjmola25";
	public static final String BBDD = "comunidadesprovincias";
	public static final String URL = "jdbc:mysql://localhost:3306/";
	public static final String TIMEZONE = "?serverTimezone=UTC";
	public static final String SSL = "?autoReconnect=true&useSSL=TRUE";
	public static final String BBDD_URL = URL+BBDD+SSL;
	
	public static Connection openConnection() throws SQLException {
		return DriverManager.getConnection(BBDD_URL, USER, PASS);
	}
	
}
