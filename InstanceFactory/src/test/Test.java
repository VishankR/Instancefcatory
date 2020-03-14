package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import interfaces.Car;

public class Test {

	public static void main(String[] args) {
		String file ="xmls/spring.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(file);
		Car c = (Car)context.getBean("c");
		c.drive();
		((ClassPathXmlApplicationContext) context).close();
	}

}
