package net.developia.spring01.di202e;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class GreetingTest {
	public static void main(String[] args) {
		ApplicationContext context = 
				new GenericXmlApplicationContext(GreetingTest.class, "beaninit.xml");
		
		Outputter output = (Outputter) context.getBean("outputterImpl");
		output.greeting();
	}
}
