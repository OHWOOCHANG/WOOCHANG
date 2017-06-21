package basic.method;

public class MethodTest10 {
	public static void main(String[] args) {
		int[] n = {23, 10, 70, 80, 60, 25};
		
		int max = maxNumber(n);
		int min = minNumber(n);
		
		System.out.println(n.length);
		System.out.println("배열 n에서 가장 큰 값은 " + max);
		System.out.println("배열 n에서 가장 작은 값은 " + min);
	}

	private static int minNumber(int[] n) {
		int min = n[0];
		for(int i=1; i < n.length; i++) {
			if (min > n[i]) min = n[i];
		}
		return min;
	}

	private static int maxNumber(int[] n) {
		int temp = 0;
		for (int i=0; i<=n.length-2; i++) {
			if (n[i+1] < n[i]) {
				temp = n[i];
				n[i] = n[i+1];
				n[i+1] = temp;
			}
		}
		return n[n.length-1];
	}
	
	

}
