package ch02_ifelse;

import java.util.Scanner;

public class QuizeIfelse {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 세과목의 점수를 확인해서 합격, 불합격을 알려주는 코드를 작성하세요
	    // - 합격 조건 : 각 과목별 점수가 40 이상이면서, 평균은 60 이상이어야 합니다
	    
		System.out.print("세과목의 점수 입력 > "); 
		int test1 = scan.nextInt();
		int test2 = scan.nextInt();
		int test3 = scan.nextInt();
		int test4 = test1 + test2 + test3;
		double test5 = (double)test4/3;
		
		System.out.println("세 과목 합 : " + test4);
		System.out.println("세 과목 평균 : " + test5);
		
		if(test1 >= 40 && test2 >= 40 && test3 >= 40) {
			if(test5 >= 60) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			}
		} else {
			System.out.println("불합격");
		}
		
//------------------------------------------------------------------------------//
	    // ATM 코드를 작성하세요
	    // - 현재 통장 잔고를 설정합니다
	    //   인출 금액을 설정합니다
	    //   인출 금액이 정상이면, 출금 후 잔액을 알려줍니다
	    //   > 인출 조건 : 잔액보다 작거나 같아야 합니다
	    //                 10000 원 단위만 가능합니다( 11000 X, 10001 X )
	    //                 -(minus) 금액은 안됩니다
		
		System.out.print("현재 통장 잔고를 입력하시오 > "); 
		int my_bank = scan.nextInt();
		System.out.print("출금하실 금액를 입력하시오 > "); 
		int print_bank = scan.nextInt();
		
		if(my_bank >= print_bank) {
			if(print_bank % 10000 == 0 && print_bank >= 0) {
				my_bank -= print_bank;
				System.out.println("출금되었습니다");
			} else {
				System.out.println("10000원 단위만 출금 가능합니다");
			}	
		} else {
			System.out.println("잔액 부족"); 
		}
		System.out.println("잔액 : " + my_bank);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
