package ch05_switch;

/*
 * switch문
 * 정확하게 일치하는 값만 찾아서 어쩌고 저쩌고
 * - switch(값) {
 *   case 상수값: 
 *        실행코드
 *        break;  <= switch종료
 *   ........
 *   case 상수값: 
 *        실행코드
 *        break;
 *   default:  <= 매칭되는 case 값이 없을때에 실행 (마찬가지로 필요없으면 안써도 무관)
 *        실행코드
 * }
 * 
 * 
 *  > switch문 안의 값과 정확히 일치하는 case값을 찾아서 해당 지역의 코드를 실행
 *    - switch :정수, 문자, 문자열 (실수는 판독 불가)
 *    - case : 상수만 사용 가능(변수 안됨)
 *             하나의 case가 끝나는 마지막에 break;를 사용해서 종료
 *    - default : 매칭되는 case값이 없을때 실행 할 코드가 있으면 사용
 */

public class SwitchEx01 {
	public static void main(String[] args) {
		int no = 1;
		System.out.println("no : " + no);
		System.out.println();
		
		switch(no) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default:
			System.out.println("?_?");

		}
		
	}
}
