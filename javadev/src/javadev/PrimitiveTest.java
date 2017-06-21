package javadev;

public class PrimitiveTest {
	public static void main(String[] args) {
		boolean b = true;
		System.out.println("b = " + b);
		
		byte b2 = 127;
		System.out.println("b2 = " + b2);
		
		int i = 2147483647;
		System.out.println("i = " + i);
		
		short s = 32767;
		System.out.println("s = " + s);
		
		long l1 = 2147483648L;
		System.out.println("l1 = " + l1);
		
		// char : 2byte - 반드시 작은 따음표
		char c = '뒯';
		System.out.println("c = " + c);
		
		double d = 3.1415926535;
		System.out.println("d = " + d);
		
		float f = 3.1415926535f;
		System.out.println("f = " + f);
		
		
		// escape sequence
		System.out.println("가\t나\t다");
		System.out.println("가  나  다");
		System.out.println("안녕하세요\n딸기밭이여 영원하라");
		System.out.println("하이\\하이");
		System.out.println("\"야호~~~\"");
	
		System.out.print("a");
		System.out.print("a");
		System.out.print("a");
		System.out.print("a");

	}
}
