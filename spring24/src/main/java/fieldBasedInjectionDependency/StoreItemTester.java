package fieldBasedInjectionDependency;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StoreItemTester {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext(StoreItemConfig.class);

		Store store = annotationContext.getBean(Store.class);
		store.payForItem();
		annotationContext.close();
	}

}
