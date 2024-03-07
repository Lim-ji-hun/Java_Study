package ch06_for;

import java.util.Scanner;

public class QuizFor {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 지정한 숫자 만큼의 '*'을 출력하는 코드를 작성하세요
	    // Ex) 횟수 : 7
	    //     *******
		
//		System.out.print("숫자 입력 > "); 
//		int num = scan.nextInt();
//		
//		for(int i=1 ; i<=num ; i++) {
//			System.out.print('*');
//		}
			
		
		//--------------------------------------------------------------------------------
		
	    // 하나의 for문으로 1 ~ 50 사이의 3과 7의 배수를 출력하고, 각각의 배수의 합을 구하는 코드를 작성하세요
	    // 단, 3의 배수이면서 7의 배수도 되는 수는 한번만 출력되어야 합니다
//		int three = 0;
//		int seven = 0;
//		int th_se = 0;
//		for(int i=1 ; i<=50 ; i++) {
//			
//			if(i%3 == 0 && i%7 == 0) {
//				System.out.println("3과 7의 배수 : " + i);	
//				th_se += i;
//			}else if(i%3 == 0) {
//				three += i;
//			}else if(i%7 == 0) {
//				seven += i;
//		    }
//		}
//		System.out.println();
//		System.out.println("3과 7의 배수 합 : " + th_se);
//		System.out.println("3의 배수 합 : " + three);
//		System.out.println("7의 배수 합 : " + seven);
		
		
		
		
		//--------------------------------------------------------------------------------
		
	    // 알파벳 대문자 A ~ Z 까지를 출력하는 코드를 작성하세요
	    // for 문이 한번 회전 할 때마다 알파벳 하나씩 출력됩니다  

//		for(char ch='a' ; ch<='z' ; ch++) {
//			System.out.print(ch+" ");
//		}
		
//		for(int i=65 ; i<=90 ; i++) {
//			System.out.print((char)i+" ");
//		}
		
		
	    // 구구단 값을 아래와 같은 형태로 출력하는 코드를 작성하세요
	    // - 2 * 1 =  2,   3 * 1 =  3,  4 * 1 =  4,  ...  9 * 1 =  9
	    //   2 * 2 =  4,   3 * 2 =  6,  4 * 2 =  8,  ...  9 * 2 = 18
	    //                   .............
	    //   2 * 9 = 18,   3 * 9 = 27,  4 * 9 = 36,  ...  9 * 9 = 81   
		
		for(int i=2 ; i<=9 ; i++) {
			for(int dan=1 ; dan<=9 ; dan++) {
				System.out.printf("%d X %d = %d", dan, i, dan*i);
				if(dan != 9) {
					System.out.print(", ");
					
				}
			}System.out.println();
		}
		
		
	}
	

}
