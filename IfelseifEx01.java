package ch04ifelseif;

/*
 * if ~ else if
 * - if(조건식_a){
 *     조건식_a가 참이면 실행
 *   } else if(조건식_b){
 *     조건식_a가 거짓이고 조건식_b가 참이면 실행 
 *   } else if는 필요에 따라 얼마든지 추가 가능
 *   
 *   } else {
 *     위의 모든 조건식이 거짓이면 실행 (사용 o, x)
 *   }
 *   
 *   > 여러개의 조건식 중 하나만 찾아서 실행하게 됨
 */


public class IfelseifEx01 {
	
	public static void main(String[] args) {
		
		int var = 5;
		System.out.println("var : " + var);
		System.out.println();
		
		System.out.println("if 여러개");
		
		if(var>20) {
			System.out.println("20 보다 큰수");
		}
		if(var>10) {
			System.out.println("10 보다 큰수");
		}
		if(var>0) {
			System.out.println("0 보다 큰수");
		}
		System.out.println();
		
		System.out.println("if ~ else if");
		
		if(var>20) {
			System.out.println("20 보다 큰수");
		}else if(var>10) {
			System.out.println("10 보다 큰수");
		}else if(var>0) {
			System.out.println("0 보다 큰수");
		}
		
	}

}
