package ch01_if;

import java.util.Scanner;

public class QuizIf {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 세개의 수 중에서 큰수를 찾는 코드를 작성하세요
	    // - 세개의 수는 모두 1 이상이고, 같은 값은 없습니다
	      
		System.out.print("서로 다른 1이상의 숫자 3개 입력 > "); 
		int m1 = scan.nextInt();
		int m2 = scan.nextInt();
		int m3 = scan.nextInt();
		
		if(m1 > m2) {
			if(m1 > m3) {
				System.out.print("가장 큰 숫자 : " + m1); 
			}
			if(m1 < m3) {
				System.out.print("가장 큰 숫자 : " + m3);
			}
		}
		if(m1 < m2) {
			if(m2 > m3) {
				System.out.print("가장 큰 숫자 : " + m2); 
			}
			if(m2 < m3) {
				System.out.print("가장 큰 숫자 : " + m3);
			}
		}
	      
		
		
		
		//--------------------------------------------------------------------------------//
		
		
	    // 성별(m, f) 를 사용해서 m 이면 "남성", f 이면 "여성"을 출력하는 코드를 작성하세요
	    
		System.out.print("성별 입력 > "); 
		char gender = scan.next().charAt(0);
		
		
		if(gender == 'm') {
			System.out.println("성별 : 남성");
		}
		if(gender == 'f') {
			System.out.println("성별 : 여성");
		}
		
		//String(문자열)로 ==을 할때에는 if(gender.equals("m")을 사용
		
	    // 두수의 합이 2의 배수이면서, 3의 배수도 되는지를 확인하는 코드를 작성하세요
		System.out.print("숫자 2개 입력 > ");
		int any_m1 = scan.nextInt();
		int any_m2 = scan.nextInt();
		int any_m3 = any_m1 + any_m2;
		
		if(any_m3 % 2 == 0) {
			if(any_m3 % 3 == 0) {
				System.out.print("2와 3의 배수임");
			}
			if(any_m3 % 3 != 0) {
				System.out.print("3의 배수가 아님");
			}
		}
		if(any_m3 % 2 != 0) {
			System.out.print("2의 배수가 아님");
		}
	      
	    // 두점 사이의 거리를 구하는 코드를 작성하세요
	    // - 거리의 결과는 + 값으로만 나와야 합니다
	    // Ex) 첫번째 위치 : 2
	    //     두번째 위치 : 7
	    //     거리        : 5
		System.out.print("두 점의 숫자 입력 > ");
		int dot_m1 = scan.nextInt();
		int dot_m2 = scan.nextInt();
		
		if (dot_m1 > dot_m2) {
			int dot_m3 = dot_m1 - dot_m2;
			System.out.println("첫번째 위치 : " + dot_m1);
			System.out.println("두번째 위치 : " + dot_m2);
			System.out.println("거리 : " + dot_m3);
		}
		if (dot_m1 < dot_m2) {
			int dot_m4 = dot_m2 - dot_m1;
			System.out.println("첫번째 위치 : " + dot_m1);
			System.out.println("두번째 위치 : " + dot_m2);
			System.out.println("거리 : " + dot_m4);
		}
	}

}








