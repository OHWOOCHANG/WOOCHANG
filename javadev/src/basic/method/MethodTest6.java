package basic.method;

public class MethodTest6 {
	public static void main(String[] args) {
		int a=10, b=5;
		swapNumber(a, b);
		
		
		int[] lotto = {1,2,3,4,5,6};
		swapRandom(lotto);
		for (int i=0; i<lotto.length; i++) {
			System.out.println(lotto[i] + "\t");
		}
	}
	
	private static void swapNumber(int a, int b) {
		int temp = a;
		a = b;
		b = a;
	}
	
	private static void swapRandom(int[] lotto) {
		int temp = lotto[0];
		lotto[0] = lotto[5];
		lotto[5] = temp;
		}
}
