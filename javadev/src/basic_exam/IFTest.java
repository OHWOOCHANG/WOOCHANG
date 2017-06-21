package basic_exam;

import java.util.Scanner;

public class IFTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("점수를 입력(0~100) : ");int n = sc.nextInt();
		
		/*if (n >= 90 && n <= 100) {
			System.out.println("A");
		} else if (n >= 80 && n < 90){
			System.out.println("B");
		} else if (n >= 70 && n < 80){
			System.out.println("C");
		} else if (n >= 60 && n < 70){
			System.out.println("D");
		} else if (n >= 0 && n < 60){
			System.out.println("F");
		} else{
			System.out.println("점수 조건에 맞게 입력하세요");
		}*/
		
		
		if (n >= 90 & n <= 100) {
			System.out.println("A");
		} else if (n >= 80){
			System.out.println("B");
		} else if (n >= 70){
			System.out.println("C");
		} else if (n >= 60){
			System.out.println("D");
		} else if (n >= 0){
			System.out.println("F");
		}
		System.out.println("종료");
	}
}
