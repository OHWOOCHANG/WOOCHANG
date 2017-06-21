package basic_exam;

public class DoWhileTest {
	public static void main(String[] args) {
		int i = 1,j;
		i = (int)(Math.random()*6) + 1;
		do {
			j = (int) (Math.random() * 6) + 1;
			i ++;
		}while(i == j);
		
		System.out.println("i = " + i);
		System.out.println("j = " + j);
	}
}
