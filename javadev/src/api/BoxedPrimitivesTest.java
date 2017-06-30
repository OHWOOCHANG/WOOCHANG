package api;

public class BoxedPrimitivesTest {
	public static void main(String[] args) {
		Integer i = new Integer(10);
		Integer i2 = 10;
		
		int i3 = i;
		
		Object i4 = 10;
		int i5 = (int) i4;
		int i6 = (Integer) i4;
		int i7 = Integer.parseInt("100");
		long l1 = Long.parseLong("100l");
	}
}
