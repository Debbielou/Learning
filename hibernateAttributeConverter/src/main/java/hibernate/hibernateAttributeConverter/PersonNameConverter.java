package hibernate.hibernateAttributeConverter;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class PersonNameConverter implements AttributeConverter<PersonName, String>{
	
	 @Override
	    public String convertToDatabaseColumn(PersonName personName) {
	        if (personName == null) {
	            return null;
	        }
	        return personName.getFirstName() + " " + personName.getSecondName(); 
	        	    
	 }
	 
	 
	 @Override
	    public PersonName convertToEntityAttribute(String dbData) {
	        if (dbData == null) {
	            return null;
	        }
	        String[] parts = dbData.split(" ");
	        return new PersonName(parts[0], parts[1]);
	 }

}
