package hibernateQueryLanguage.LearningHqL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnection {
	
		private static final String URL = "jdbc:mysql://localhost:3306/demodatabase";
	    private static final String USER = "root";
	    private static final String PASSWORD = "Debbie@2024%";
	    
	  	    public static Connection getConnection() {
	        Connection connection = null;
	        try {
	            connection = DriverManager.getConnection(URL, USER, PASSWORD);
	            System.out.println("Connection successful!");
	        } catch (SQLException e) {
	            e.printStackTrace();
	            System.out.println("Connection failed!");
	        }
	        return connection;
	    }
	}



