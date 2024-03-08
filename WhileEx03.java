package ch07_while;

import java.util.Scanner;

/*
 * do while문
 * - do {
 *        실행 코드
 *   } while(조건식);
 * 
 */

public class WhileEx03 {
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		int value = 0;
		int total = 0;
		
		do {
			System.out.print("숫자 입력(종료 : 0) >> ");
			value = scanner.nextInt();
			total += value;
		} while(value != 0);
		System.out.println("입력값의 합 : " + total);
		
		
		
		
	}
	
	

}
