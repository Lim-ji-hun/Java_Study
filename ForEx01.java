package ch06_for;

/* for문
 * -for (초기식 ; 조건식 ; 증감식){
 *      실행 코드
 *  }
 *  
 *  > 초기식 : 반복 횟수를 카운트하는 변수의 선언(생성)과 초기값 설정
 *           for문 실행과 동시에 최초 한번만 실행
 *    조건식 : 반복문 실행 확인
 *    증감식 : 반복횟수를 카운트 하는 변수의 값을 증가 or 감소       
 */

public class ForEx01 {
	
	public static void main(String[] args) {
		//       1     2     4
		for(int i=0 ; i<3 ; i++) {
			// 3
			System.out.println(i);
			
			//1(1번만 실행) -> 2(참) -> 3 -> 4
			//               2(참) -> 3 -> 4
			//               2(참) -> 3 -> 4
			//               2(거짓) -> 종료

		 
		}
		for(int i=2 ; i>=0 ; i--) {
			System.out.println(i);

		 }
			
		
	}
	
	
}
