package net.developia.spring01.di101;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVTest {
	public static void main(String[] args) {
		ApplicationContext context = 
				new GenericXmlApplicationContext("net/developia/spring01/di101/beaninit.xml");
		
		System.out.println("----------------");
		TV tv = (TV) context.getBean("tv");
		
		tv.powerOn(); 
		tv.channelUp();
		tv.channelDown();
		tv.soundUp();
		tv.soundDown();
		tv.powerOff();
	}
}
