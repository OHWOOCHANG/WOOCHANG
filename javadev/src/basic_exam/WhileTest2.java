package basic_exam;

public class WhileTest2 {
	public static void main(String[] args) {
		int i = 1;
		int j = 3;
		int sum = 0;
		
		while(i <= 10){
			System.out.println(i*10 + ":김지혁");
			i ++;	
		}
		
		while(j<=1000){
			sum += j;
			j +=3;
		}
		
		System.out.println(sum);
	}
}
