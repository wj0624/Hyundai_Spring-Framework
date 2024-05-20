package net.developia.oop5;

import java.io.FileInputStream;
import java.util.Properties;

public class TVTest {
	public static void main(String[] args) throws Exception {
//		SamsungTV tv = new SamsungTV();
//		
//		tv.powerOn();
//		tv.channelUp();
//		tv.channelDown();
//		tv.soundUp();
//		tv.soundDown();
//		tv.powerOff();
//		// 의존관계과 높다. 
		
//		LGTV tv = new LGTV(); // 가능
//		tv.powerOn(); 
//		tv.channelUp();
//		tv.channelDown();
//		tv.soundUp();
//		tv.soundDown();
//		tv.powerOff();
		
//		// 될 수 있으면 업캐스팅을 사용하는 것이 좋다. 
//		TV tv = new LGTV();
//		tv.powerOn(); 
//		tv.channelUp();
//		tv.channelDown();
//		tv.soundUp();
//		tv.soundDown();
//		tv.powerOff();
//		
//		
//		// 만약 삼성TV를 쓰고 싶다면,
//		TV tv1 = new SamsungTV();
//		tv.powerOn(); 
//		tv.channelUp();
//		tv.channelDown();
//		tv.soundUp();
//		tv.soundDown();
//		tv.powerOff();
		
		
//		TV tv = new AppleTV(); // AppleTV
//		
//		tv.powerOn(); 
//		tv.channelUp();
//		tv.channelDown();
//		tv.soundUp();
//		tv.soundDown();
//		// AppleTV에 의존적이다.
		
		
		// TV 구현체 의존성 줄이는 방법
		Properties props = new Properties();
		props.load(new FileInputStream("product.properties"));
		String tvName = props.getProperty("tv");
		Class tvClass = Class.forName(tvName);
		TV tv = (TV) tvClass.getConstructor().newInstance(); // AppleTV
		
		
		
		// Speaker 구현체 의존성 줄이는 방법
		props.load(new FileInputStream("product.properties"));
		String speakerName = props.getProperty("speaker");
		Class speakerClass = Class.forName(speakerName);
		Speaker speaker = (Speaker) speakerClass.getConstructor().newInstance(); // AppleTV
		tv.setSpeaker(speaker);
		
		tv.powerOn(); 
		tv.channelUp();
		tv.channelDown();
		tv.soundUp();
		tv.soundDown();
		tv.powerOff();

	}
	
	//appleTV에서 MarshallSpeaker가 되게 작성을 해주세요!
}
