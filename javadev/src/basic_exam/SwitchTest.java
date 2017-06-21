package basic_exam;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		int n;
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("점수를 입력(0~100) : ");
		n = sc.nextInt();
		
		
		switch (n/10) {
		case 9:
		case 10:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			break;
		}
	}

}
