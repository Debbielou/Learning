package enumHandling;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class CategoryConverter implements AttributeConverter <Category, String> {
	
	
	@Override
    public String convertToDatabaseColumn(Category category) {
        if (category == null) {
            return null;
        }
        return category.getCode(); 

    }
    @Override
    public Category convertToEntityAttribute(String code) {
        if (code == null) {
            return null;
        }

        for (Category category : Category.values()) {
            if (category.getCode().equals(code)) {
                return category;
            }
        }

        throw new 
     IllegalArgumentException("Invalid category code: " + code);
    }
    }

