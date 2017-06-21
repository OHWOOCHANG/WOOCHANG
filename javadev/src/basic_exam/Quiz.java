package basic_exam;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		int n;
		int a = (int) (Math.random() * 3 + 1);
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("1~3 중 입력 : ");
		n = sc.nextInt();
		
		
		if(n == 1) {
			switch (a) {
			case 1:
				System.out.println("you : " + "가위");
				System.out.println("com : " + "가위");
				System.out.println("무승부");
				break;
			case 2:
				System.out.println("you : " + "가위");
				System.out.println("com : " + "바위");
				System.out.println("컴퓨터승리");
				break;
			default:
				System.out.println("you : " + "가위");
				System.out.println("com : " + "보");
				System.out.println("당신의승리");
				break;
			}
			
			}
		else if(n == 2) {
			switch (a) {
			case 1:
				System.out.println("you : " + "바위");
				System.out.println("com : " + "가위");
				System.out.println("당신의 승리");
				break;
			case 2:
				System.out.println("you : " + "바위");
				System.out.println("com : " + "바위");
				System.out.println("무승부");
				break;
			default:
				System.out.println("you : " + "바위");
				System.out.println("com : " + "보");
				System.out.println("컴퓨터승리");
				break;
			}
			
		}
		else if(n == 3) {
			switch (a) {
			case 1:
				System.out.println("you : " + "보");
				System.out.println("com : " + "가위");
				System.out.println("컴퓨터 승리");
				break;
			case 2:
				System.out.println("you : " + "보");
				System.out.println("com : " + "바위");
				System.out.println("당신의 승리");
				break;
			default:
				System.out.println("you : " + "보");
				System.out.println("com : " + "보");
				System.out.println("무승부");
				break;
			}
			
		}
	
	
		
	}
}
