package ch10_quiz;

import java.util.Scanner;

public class BankBook {
	
	/*
	 * 하나의 은행 상품을 관리하는 BankBook class 를 정의하고, BankBookManager class 에서 테스트 하세요
	 * - 이율 : 한번의 설정으로 모든 계좌의 이율 변경 가능
	 *   계좌번호 : 한번 설정 후 변경 불가
	 *   고객명, 잔액
	 * - 기능
	 *   > 입/출금, 통장 정보 확인, 이율 변경/확인 가능
	 */
	
	public static double rate;
	private final int num;
	private String name;
	private int money;
	
	public BankBook(int num, String name, int money){
		
		this.num = num;
		this.name = name;
		this.money = money;
	}
	
	static {
		rate = 2;
	}
	
	public String getname() {return name;}
	public void setname(String name) {
		this.name = name;
	}
	
	public int getmoney() {return money;}
	public void setmoney(int money) {
		this.money = money;
	}
	
	void pm() {
		System.out.print("입금 or 출금 >> ");
		Scanner scan = new Scanner(System.in);
		String pm = scan.next();
		if(pm.equals("입금")) {
			System.out.print("입금할 금액 >> ");
			int plus = scan.nextInt();
			if(plus >= 0) {
				money += plus;
				System.out.println("잔액 : " + money + "원");
			}else {
				System.out.println("잘못된 값");
			}
			
		} else if (pm.equals("출금")) {
			System.out.print("출금할 금액 >> ");
			int minus = scan.nextInt();
			if(money >= minus && minus >= 0) {
				System.out.print("출금됨");
				money -= minus;
				System.out.println("잔액 : " + money + "원");
			} else if(money <= minus) {
				System.out.println("잔액부족");
			} else {
				System.out.println("잘못된 값");
			}

		}else {
			System.out.println("다시 입력하시오");
		}

	}
	
	void bank() {
		System.out.println("--통장 정보--");
		//System.out.println("이율 : " + rate);
		System.out.println("계좌번호 : " + num);
		System.out.println("고객명 : " + name);
		System.out.println("잔액 : " + money + "원");
	}
	
	void change() {
		System.out.print("이율 변경/확인  >> ");
		Scanner scan = new Scanner(System.in);
		String chk = scan.next();
		if(chk.equals("확인")) {
			System.out.println("이율 : " + rate);
		} else if(chk.equals("변경")) {
			System.out.print("바꿀 이율 입력 >>");
			double change = scan.nextDouble();
			rate = change; 
			System.out.println("바뀐 이율 : " + rate);
		} else {
			System.out.println("다시 입력하시오");
		}
	}

}
