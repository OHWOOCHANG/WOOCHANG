package oop.exam10;

public class AppleSpeaker implements Speaker {

	@Override
	public void soundUp() {
		System.out.println("AppleSpeaker : 소리를 키웁니다.");
	}

	@Override
	public void soundDown() {
		System.out.println("AppleSpeaker : 소리를 줄입니다.");
	}

}
