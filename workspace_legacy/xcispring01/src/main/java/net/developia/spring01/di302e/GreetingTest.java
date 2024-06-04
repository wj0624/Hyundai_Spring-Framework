package net.developia.spring01.di302e;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GreetingTest {
	public static void main(String[] args) {
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(BeanInit.class);
		
		Outputter output = (Outputter) context.getBean("outputter");
		output.greeting();
	}
}
