package revision.springScopeSingleton;

import java.sql.Connection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main( String[] args ){
    
    	// Get the singleton instance
//    	DatabaseConnection connectionManager = DatabaseConnection.getInstance();

    	// Get the JDBC connection
//    	Connection connection = connectionManager.getConnection();
    
    	ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
    	DatabaseConnection connectionManager = context.getBean("databaseConnection", DatabaseConnection.class);
    	System.out.println(connectionManager);
    	connectionManager.getConnection();
    }
}
