package net.developia.spring01.di102;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVTest {
	public static void main(String[] args) {
		ApplicationContext context = 
				new GenericXmlApplicationContext(TVTest.class, "beaninit.xml");
		// 현재 내 클래스가 있는 곳에서 beaninit.xml 파일 읽어오기
		
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
