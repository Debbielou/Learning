package constructorInjectionDependency;

public class Person {

	int age;
	String name;
	Address address;
	
	public Person() {
		System.out.println("Person is initialized");
	}
		
	//constructor injection
		public Person (Address address) {
			this.address = address;
			
		}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	//setter injection
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
