package ch07_while;

import java.util.Scanner;

public class WhileEx02 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		
		int data = -1;
		while(data < 0) {
			System.out.println("숫자 입력 >>");
			
			data = scanner.nextInt();

		}
		System.out.println("data : " + data);
		
		System.out.println();
		
		while(true) {
			System.out.println("숫자 입력 >>");
			data = scanner.nextInt();
			if(data >= 0)
				break;
		}
		System.out.println("입력값 : " + data);
	}

}


