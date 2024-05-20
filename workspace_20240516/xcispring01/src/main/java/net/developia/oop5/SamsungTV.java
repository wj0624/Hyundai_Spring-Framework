package net.developia.oop5;

public class SamsungTV implements TV{
	private Speaker speaker;
	
	public void powerOn() {
		System.out.println("Samsung : TV를 켭니다.");
	}
	
	public void powerOff() {
		System.out.println("Samsung : TV를 끕니다.");
	}
	
	public void channelUp() {
		System.out.println("Samsung : 채널을 올립니다.");
	}
	
	public void channelDown() {
		System.out.println("Samsung : 채널을 내립니다.");
	}
	
	public void soundUp() {
		if(speaker == null)
			System.out.println("Samsung : 소리를 키웁니다.");
		else {
			speaker.soundUp();
		}
	}
	
	
	public void soundDown() {
		if(speaker == null)
			System.out.println("Samsung : 소리를 줄입니다.");
		else {
			speaker.soundDown();
		}
	}
	
}
