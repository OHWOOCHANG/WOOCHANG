package basic_exam;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		String[] caption = {"가위", "바위", "보"};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("가위는 1, 바위는 2, 보는 3을 입력하세요 > ");
		
		int you = sc.nextInt();
		int com = (int) (Math.random() * 3) + 1;
		
		System.out.println("You : " + caption[you - 1]);
		System.out.println("Com : " + caption[com - 1]);
		
		if(you - com == 1 || you - com == -2){
			System.out.println("당신의 승리");
		} else if(you - com == -1 || you - com == 2){
			System.out.println("당신의 패배");
		} else {
			System.out.println("무승부");
		}
		
	}
}
