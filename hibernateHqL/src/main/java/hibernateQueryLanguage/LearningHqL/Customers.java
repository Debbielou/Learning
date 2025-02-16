package hibernateQueryLanguage.LearningHqL;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;

@Entity
@NamedQuery(name = "Customers.byId", query = "from Customers where customer_ID = :customerId") 
public class Customers { 
   
	    @Id
	    private int customer_ID;
	    private String customer_name;
	    private String contact_name;
	    private String address;
	    private String city;
	    private String postal_code;
	    private String country;
	    
		public Customers() {
			
		}
		
		public Customers(int customer_ID, String customer_name, String contact_name, String address, String city,
				String postal_code, String country) {
			this.customer_ID = customer_ID;
			this.customer_name = customer_name;
			this.contact_name = contact_name;
			this.address = address;
			this.city = city;
			this.postal_code = postal_code;
			this.country = country;
		}



		public int getCustomer_ID() {
			return customer_ID;
		}

		public void setCustomer_ID(int customer_ID) {
			this.customer_ID = customer_ID;
		}

		public String getCustomer_name() {
			return customer_name;
		}

		public void setCustomer_name(String customer_name) {
			this.customer_name = customer_name;
		}

		public String getContact_name() {
			return contact_name;
		}

		public void setContact_name(String contact_name) {
			this.contact_name = contact_name;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getPostal_code() {
			return postal_code;
		}

		public void setPostal_code(String postal_code) {
			this.postal_code = postal_code;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		@Override
		public String toString() {
			return "Customers [customer_ID=" + customer_ID + ", customer_name=" + customer_name + ", contact_name="
					+ contact_name + ", address=" + address + ", city=" + city + ", postal_code=" + postal_code
					+ ", country=" + country + "]";
		
	    
		

//	    public static void main(String[] args) {
//	    
//	    		 
//		        Connection connection = DatabaseConnection.getConnection();
//		        if (connection != null) {
//		            Configuration conf = new Configuration().configure("hibernate.cfg.xml");
//		            sf = conf.buildSessionFactory();
//
//		       
//		   
//	        if (connection != null) {
//	            try {
//	                Statement statement = connection.createStatement();
//	                String query = "SELECT * FROM customers WHERE customer_ID = 10";
//	                ResultSet resultSet = statement.executeQuery(query);
//
//	                while (resultSet.next()) {
//	                    int customerID = resultSet.getInt("customer_ID");
//	                    String customerName = resultSet.getString("customer_name");
//	                    String contactName = resultSet.getString("contact_name");
//	                    String address = resultSet.getString("address");
//	                    String city = resultSet.getString("city");
//	                    String postalCode = resultSet.getString("postal_code");
//	                    String country = resultSet.getString("country");
//
//	                    System.out.println("Customer ID: " + customerID);
//	                    System.out.println("Customer Name: " + customerName);
//	                    System.out.println("Contact Name: " + contactName);
//	                    System.out.println("Address: " + address);
//	                    System.out.println("City: " + city);
//	                    System.out.println("Postal Code: " + postalCode);
//	                    System.out.println("Country: " + country);
//	                
//
//	                resultSet.close();
//	                statement.close();
//	                connection.close();
//	                } catch (Exception e) {
//	                e.printStackTrace();
//	            
//	                }
//	            }
//	        }
	    
		        }
		
}


