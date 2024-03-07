package ch05_switch;

import java.util.Scanner;

public class QuizSwitch {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 버스 단말기 코드를 작성하세요
	    // - 요금 : 일반(1500), 학생(920)
	    //   버스 카드 잔액, 사용 카드(일반, 학생)을 설정합니다
	    //   일반, 학생 카드인지를 확인해서, 정상이면 차감된 금액을 알려주세요
	    // Ex) 잔액 : 2000 원
	    //     일반, 학생 > 일반
	    //     삑! 잔액 : 500 원
		
//		System.out.print("사용 카드를 입력하시오(일반, 학생) > "); 
//		String on = scan.next();
//		int money = 2000;
//		
//		
//		switch(on) {
//		case "일반":
//			on = "일반 카드";
//			money -= 1500;
//			break;
//		case "학생":
//			on = "학생 카드";
//			money -= 950;
//			break;
//		default:
//			on = "잘못된 입력";
//			break;
//		}	
//		System.out.println(on + "입니다");
//		System.out.println("남은 금액" + money + "입니다");
		

	    // 월을 입력받아서 해당 월이 몇일가지 있는지를 알려주는 코드를 작성하세요
	    // - 2월은 "28일 or 29일" 출력으로 처리하세요
	    // Ex) 월 입력 > 3
	    //     31일
		
//		System.out.print("n월을 입력하시오 > "); 
//		String month = scan.next();
//		String day = "0";
//		
//		switch(month) {
//		case "1월":
//		case "3월":
//		case "5월":
//		case "7월":
//		case "8월":
//		case "10월":
//		case "12월":
//			day = "31";
//			break;
//		case "2월":
//			day = "28일 or 29일";
//			break;
//		case "4월":
//		case "6월":
//		case "9월":
//		case "11월":
//			day = "30";
//			break;
//		default:
//			day = "다시 입력하시오";
//			break;
//		}
//		System.out.println(day); 
		
//		System.out.print("n월을 입력하시오 > "); 
//		int month = scan.nextInt();
//		String day = "0";
//		
//		switch(month) {
//		case 1:
//		case 3:
//		case 5:
//		case 7:
//		case 8:
//		case 10:
//		case 12:
//			day = "31";
//			break;
//		case 2:
//			day = "28일 or 29일";
//			break;
//		case 4:
//		case 6:
//		case 9:
//		case 11:
//			day = "30";
//			break;
//		default:
//			day = "다시 입력하시오";
//			break;
//		}
//		System.out.println(day); 
//		
		
		
	      // 간단한 사칙연산 계산기 코드를 작성하세요
	      // Ex) + , - , * , / 선택 >> *
	      //     첫번째 숫자 입력 > 12
	      //     두번째 숫자 입력 > 2
	      //     12 * 2 = 24
		
		
		System.out.println("--계산기--"); 
		System.out.print("+. -. *. / 중 선택 >> "); 
		String aaa = scan.next();
		
		
		if(aaa.equals("+") || aaa.equals("-") || aaa.equals("*") || aaa.equals("/")) {
			
			System.out.print("첫번째 숫자 입력 > "); 
			int fi = scan.nextInt();
			System.out.print("두번째 숫자 입력 > "); 
			int se = scan.nextInt();
			
			int num = 0;
		
			switch(aaa) {
			case "+":
				num = fi+se;
				break;
			case "-":
				num = fi-se;
				break;
			case "*":
				num = fi*se;
				break;
			case "/":
				num = fi/se;
				break;
			}
			
			System.out.println(fi + aaa + se + "=" + num); 
			
		} else {
			System.out.println("다시입력하시오"); 
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
