package hibernate.hibernateEqualsAndHashCode;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Orders {

	@Id
	@Column(name = "column-id")
	private int id;
    private String productName;
    
    @ManyToOne
    private Person person;

    
    public Orders() {
	}
    
    	public Orders(int id, String productName, Person person) {
		this.id = id;
		this.productName = productName;
		this.person = person;
	}
    	
	public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public Person getPerson() {
			return person;
		}

		public void setPerson(Person person) {
			this.person = person;
		}

	@Override
    public boolean equals(Object j) {
        if (this == j) return true;
        if (j == null || getClass() != j.getClass()) return false; 

        Orders orders = (Orders) j;
        return productName == orders.productName;
//        return id == orders.id;
    }

    @Override
    public int hashCode() {
    	return productName.hashCode();
//        return Integer.hashCode(id);
    }
}

