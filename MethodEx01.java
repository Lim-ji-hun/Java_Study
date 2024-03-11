/*
 * method 
 * - class 안에 하나의 기능을 가진 작은 프로그램
 * 
 * 
 */
public class MethodEx01 {
	
/* public - 접근제한자, 접근지정자
 * static - 지정예약어(자바에서 사용중인 언어)
 * void - 반환타입
 * main - 메서드 이름
 * String[] args - 매개변수
 */
	public static void main(String[] args) {
		
		//반환타입 : 메서드의 실행이 종료되면서 호출부로 돌아갈때 보내지는 값의 자료형
		//         기본자료형, 참조자료형 - void는 반환값이 없을때 사용
		//메서드명 : 메서드 실행 (호출)시에 사용하는 이름
		//매개변수 : 호출부에서 보내지는 값을 보관하는 변수(사용 o, x)
		
		//메서드 호출 : 메서드명을 사용해서 실행
		// - 메서드명( 인자값 );
		//   > 메서드 정의부에 매개변수가 있으면 메서드 호출시에 해당타입에 맞는 값을 보내야 함 
		
		hi();
		
		dataSend(10);
		
		System.out.println(returnPi());
		double pi = returnPi();
		System.out.println("pi : " + pi);
		
		String stn = "시작";
		stn = sendReceive(stn);
		System.out.println("stn : " + stn);
		
		
	} // main
	// 메서드 정의 : 메서드 호출시에 실행하는 기능 구현
	public static void hi() {
		System.out.println("안녕하세요");
	}
	
	public static void dataSend(int param) {
		System.err.println("받은데이터 : " + param);
	}
	// return : 메서드 실행에서 나온 결과물을 호출부로 보낼 때 사용한다
	public static double returnPi() {
		return 3.14;
	}
	public static String sendReceive(String stn) {
		System.out.println("받은 문자열 : " + stn);
		stn = "종료";
		return stn;
	}

}
