package ch07_while;

/*
 * while 문
 * - while(조건식){
 *         조건식이 참이면 실행
 *   }
 * 
 */
public class WhileEx01 {
	public static void main(String[] args) {
		
		int cnt =1;
		while(cnt <= 3) {
			System.out.println(cnt);
			++cnt;
			
		}
		System.out.println();
		
		cnt =1;
		while(true) {
			if(cnt > 5)
				break;
			System.out.println(cnt);
			++cnt;
		}
		System.out.println();
		
		cnt = 1;
		boolean run = true;
		while(run) {
			System.out.println(cnt);
			++cnt;
			if(cnt > 5)
				run = false;
		}	
	}
}
