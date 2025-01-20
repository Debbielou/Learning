package valueWithSetterMethod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@PropertySource("classpath:college-info.properties")
public class Fruits {

    private List<String> fruits = new ArrayList<>();

    @Autowired
    public void setFruits(@Value("#{'${listOfFruits}'.split(',')}") List<String> fruits) {
        this.fruits.addAll(fruits);
    }

    public List<String> getFruits() {
        return fruits;
    }
}
