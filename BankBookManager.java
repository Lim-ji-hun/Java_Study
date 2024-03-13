package ch10_quiz;

import java.util.Scanner;

public class BankBookManager {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		BankBook man1 = new BankBook(551124, "사람이름", 1000000);
		
		System.out.println();
		
		int a = 1;
		
		while(a != 0) {
			System.out.print("1.입/출금 2.통장 정보 확인 3.이율 변경/확인 >> ");
			int ch = scan.nextInt();
			
			if(ch == 1) {
				man1.pm();
				
			} else if (ch==2) {
				man1.bank();
				
			} else if (ch == 3) {
				man1.change();
			} else {
				System.out.println("종료");
				a = 0;
			}
		}
		
		
		
		
	}
	
}
