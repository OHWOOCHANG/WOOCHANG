package oop.exam9;

public class Singleton {
	private static Singleton singleton = null;
	private Singleton(){}
	
	public static Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
	
	
	@Override
	public String toString() {
		return "포기하는 그 순간 시험종료다~!!";
	}
}
