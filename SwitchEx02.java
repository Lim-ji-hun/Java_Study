package ch05_switch;

import java.util.Scanner;

public class SwitchEx02 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("JAVA : j, Python : p >> ");
		char subject = scanner.next().charAt(0);
		System.out.println();
		
//		switch(subject) {
//		case 'j':
//			System.out.println("자바 선택하심");
//			break;
//		case 'J':
//			System.out.println("자바 선택하심");
//			break;
//		case 'p':
//			System.out.println("파이썬 선택하심");
//			break;
//		case 'P':
//			System.out.println("파이썬 선택하심");
//			break;
//		default:
//			System.out.println("그런 과목은 읍따");
//		}
		
		switch(subject) {
		case 'j': //case에 break가 없기에 아래까지 내려감
		case 'J':
			System.out.println("자바 선택하심");
			break;
		case 'p':
		case 'P':
			System.out.println("파이썬 선택하심");
			break;
		default:
			System.out.println("그런 과목은 읍따");
		}
		
		
		
	}

}
