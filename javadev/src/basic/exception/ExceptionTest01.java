package basic.exception;

public class ExceptionTest01 {
	public static void main(String[] args) {
		
		String str = null;
		try {
			System.out.println(str.toString());
	
		} catch (NullPointerException | NumberFormatException e) {				
			System.out.println("개체 할당이 안됬음");
		} catch (Exception e) {
			e.printStackTrace();		//멀티 catch를 쓸때는 하위 클래스가 위로
		} finally{
			System.out.println("무조건수행");
		}
		System.out.println("종료");
	}
}
