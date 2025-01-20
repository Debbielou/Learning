package revision.springScopeSingleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	
	private static DatabaseConnection instance;
    private Connection connection;
    private String url;
    private String username;
    private String password; 


    // Constructor to prevent external instantiation
    private DatabaseConnection() {
        // This constructor is now empty, as the connection will be established later
    }

    // Public static method to get the single instance of the connection
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            synchronized (DatabaseConnection.class) {
                if (instance == null) {
                    instance = new DatabaseConnection();
                }
            }
        }
        System.out.println("Instance has been obtained.");
        return instance; 

    }

	    // Method to get the JDBC connection
	    public Connection getConnection() {
	    	System.out.println("I am connected.");
	        return connection;
	    }
	    
	    public void setUrl(String url) { 
	        this.url = url;
	    }

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public static void setInstance(DatabaseConnection instance) {
			DatabaseConnection.instance = instance;
		}

		public void setConnection(Connection connection) {
			this.connection = connection;
		}
	    
	}


