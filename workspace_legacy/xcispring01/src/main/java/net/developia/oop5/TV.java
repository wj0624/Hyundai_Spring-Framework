package net.developia.oop5;

public interface TV {
	public void powerOn();
	public void powerOff() ;
	public void channelUp();
	public void channelDown();
	public void soundUp();
	public void soundDown();
	public default void setSpeaker(Speaker speaker){
	};
}
