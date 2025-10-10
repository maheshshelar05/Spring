package hotel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
	 ApplicationContext  context=new AnnotationConfigApplicationContext(ConfigClass.class);
	 Hotel h=context.getBean(Hotel.class);
	 System.out.println(h);

	 Hotel h1=context.getBean(Hotel.class);
	 System.out.println(h1);            // both object will return same value or hashcode bcoz singleton design pattern
	}
}
