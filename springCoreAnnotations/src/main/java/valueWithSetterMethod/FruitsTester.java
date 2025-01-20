package valueWithSetterMethod;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FruitsTester {

    public static void main(String[] args) {
    	
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(FruitsConfig.class);

        Fruits fruits = context.getBean(Fruits.class);
        System.out.println("The fruits are " + fruits.getFruits());
        context.close();
    }
}
