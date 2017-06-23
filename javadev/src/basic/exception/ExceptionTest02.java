package basic.exception;

public class ExceptionTest02 {
	public static void main(String[] args) {
			try {
				throwException();
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("종료");
	}

	private static void throwException() throws Exception {  //throws Exception 나를 호출한 쪽에서 예외처리
	
			String str = null;
			System.out.println(str.toString());
			System.out.println("throwxcpetion 종료");  // 이 라인은 수행되지 않는다.
	}
}
