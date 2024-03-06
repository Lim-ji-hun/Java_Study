package ch02_ifelse;

/*
 * if else문
 * -if(조건문){
 *     조건문이 참이면 실행
 *     }
 *  else{
 *     조건문이 거짓이면 실행
 *     }
 * 
 *  > if문이 참일때 거깃일때 시행되는 2개의 구역이 있음 
 *    둘중 1곳은 무조건 시행됨
 */

public class IfelseEx01 {
	
	public static void main(String[] args) {
		int value = 7;
		System.out.println("valse : " + value);
			
		if(value % 2 == 1) {
			System.out.println("홀수");
		} else {
			System.out.println("짝수");
		}
	}
}







