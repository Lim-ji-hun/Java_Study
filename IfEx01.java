package ch01_if;

/*
 * 제어문
 * - 위에서 아래로 순차적으로 시행되는 프로그램의 흐름을 변경할 떄 사용
 * if믄 
 * - if (조건식){
 *       실행 코드
 * }
 * 
 * if문의 조건식이 참(true)면 if문 안의 코드를 실행한 후 하위코드를 진핼
 * if문의 조건식이 거짓(false)면 if문 안의 코드를 건너뛰고 하위코드를 진핼
 */

public class IfEx01 {
	
	public static void main(String[] args) {
		
		int money = 1000;
		System.out.println("보유 금액 : " + money + "원" );
		
		if(money >= 2000) {
			System.out.println("커피 마시기");
			money -= 2000;
		}
		
		System.out.println("집으로 가기");
		System.out.println("잔여 금액 : " + money + "원" );
		
		
	}
}
