package hibernate.hibernateEqualsAndHashCode;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Person {

	    @Id
	    @Column(name = "person_id")
	    private int id;
	    private String name;
	    
	    @OneToMany(mappedBy = "id", cascade = CascadeType.ALL)
	    private Set<Orders> orders = new HashSet<>();

	    public Person() {
		}
	    
		public Person(int id, String name, Set<Orders> orders) {
			this.id = id;
			this.name = name;
			this.orders = orders;
		}
		
		 public void addOrder(Orders myOrders) {
			 this.orders.add(myOrders); 
		        myOrders.setPerson(this);  
		    }
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Set<Orders> getOrders() {
			return orders;
		}

		public void setOrders(Set<Orders> orders) {
			this.orders = orders;
		}

		

	    @Override
	    public boolean equals(Object j) {
	        if (this == j) return true;
	        if (j == null || getClass() != j.getClass()) return false;
	        Person person = (Person) j;
	        return name == person.name; 
//	        return id == person.getId();
	    }

	    @Override
	    public int hashCode() {
	    	return name.hashCode();
//	        return Integer.hashCode(id); 
	    }

		@Override
		public String toString() {
			return "PersonId: " + id + ", Name: " + name + ", Orders:" + orders;
		}

		    
	    
	}

