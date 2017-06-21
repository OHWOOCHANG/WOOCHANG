package basic.method;

public class MethodTest9 {
	public static void main(String[] args) {
		int[] n = {100, 200};
		
		swapFunction(n);
		
		System.out.println(n[0]);
		System.out.println(n[1]);
	}

	private static void swapFunction(int[] yongbin) {
		int temp = yongbin[0];
		yongbin[0] = yongbin[1];
		yongbin[1] = temp;
		
	}
	
	

}
