package ch03_nestedif;
/*
 * 중첨 if
 * - if(조건식_a){
 *      조건식이_a가 참이면 실행
 *      if(조건식_b){
 *         조건식_a 와 조건식_b 둘다 참이면 실행 
 *      }
 *   }
 * 
 *   > 조건식에 대한 결과에 대해서 세분화 하거나, 재분류 할 때 사용
 */
public class Nestedif {
	public static void main(String[] args) {	
		
		int data = 7;
		System.out.println("data : " + data);
		
		if(data >= 0) {
			System.out.println("pius");
			if(data % 2 == 1) {
				System.out.println("홀수");
			} else {
				System.out.println("짝수");
			}
		} else {
			System.out.println("minus");
		}
		
	}
}
