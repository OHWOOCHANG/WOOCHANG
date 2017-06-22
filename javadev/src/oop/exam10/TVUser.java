package oop.exam10;

public class TVUser {
	public static void main(String[] args) {
		TV tv = new SonyTV();
		tv.setSpeaker(new OrangeSpeaker());
		tv.powerOn();
		tv.channelUp();
		tv.channelUp();
		tv.soundUp();
		tv.soundUp();
		tv.soundDown();
		tv.powerOff();
	}
}
