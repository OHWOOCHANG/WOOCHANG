package api;

public class StringTest3 {
	public static void main(String[] args) {
		String str1 = "제이비는 몇살때부터 자바를 잘했나?";
		String str2 = "제이비는 몇살때부터 자바를 잘했나?";
		
		System.out.println(str1.replace("몇살때", "언제")); // 문자열은 내부적으로 복제하여 수정을 한다.
		System.out.println(str1);

		System.out.println(str1 = str1.replace("몇살때", "언제"));
		System.out.println(str1);
		
		
	}
}
