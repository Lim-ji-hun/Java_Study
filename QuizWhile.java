package ch07_while;

import java.util.Scanner;

public class QuizWhile {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 나이를 입력받아서 출력하는 코드를 작성하세요
	      // - 0 ~ 130 사이만 가능합니다
	      
//		int old = 0;
//		
//		System.out.print("나이 입력 >> ");
//		old = scan.nextInt();
//		if(old < 0 || old > 130) {
//			System.out.println("잘못된 값");
//		} else {
//			while(old >= 0 && old <= 130) {
//				System.out.println("나이 : " + old);
//				break;
//			}
//		}
		
		// 성별을 입력받아서 출력하는 코드를 작성하세요
	    // - 남성, 여성만 가능합니다
		
//		String gender = " ";
//		
//		while(!gender.equals("남성") || !gender.equals("여성")){
//			System.out.print("성별 입력 >> ");
//			gender = scan.next();
//			if(gender.equals("남성") || gender.equals("여성")) {
//				break;
//			}
//		}
//
//		System.out.print("성병 : " + gender);
		
		// 치즈 1Box 가 저장되어 있는 창고에 1쌍의 쥐가 살고 있습니다
	    // 쥐 한마리가 하루에 먹을 수 있는 치즈의 양은 20g 이고,
	    // 치즈를 먹은 10일째 되는 날마다 쥐의 객체수가 2배씩 증가합니다
	    // 몇일만에 창고의 치즈를 모두 먹게되고, 이때까지의 쥐의 객체수를 구하는 코드를 작성하세요
		// - 치즈 1box : 1kg(1000g)
		
//		int CheeseGram = 1000;
//		int mouse = 2;
//		int day = 0;
//		
//		while(CheeseGram > 0) {
//			++day;
//			int eat = mouse * 20;
//			CheeseGram -= eat;
//			
//			if(day%10 ==0) {
//				mouse *=2;
//				
//			}
//		System.out.println("day : "+day);
//		System.out.println("mouse : " + mouse);
//			
//
//		}
		
		
	    // 집주소, 자주가는 장소 한군데씩을 저장하고, 확인할 수 있는 코드를 작성하세요
	      // - 1.집주소 등록  2.장소 등록  3.확인
	      //   0 이 입력되면 종료 됩니다
	      // Ex) 1.집주소 등록  2.장소 등록  3.확인 > 1
	      //     집주소 입력 > 서울시 오디?
	      //     1.집주소 등록  2.장소 등록  3.확인 > 3
	      //     집 : 서울시 오디?
	      //     장소 : 
	      //     1.집주소 등록  2.장소 등록  3.확인 > 2
	      //     장소 입력 > 어딘지 모름
	      //     1.집주소 등록  2.장소 등록  3.확인 > 3
	      //     집 : 서울시 오디?
	      //     장소 : 어딘지 모름
	      //     1.집주소 등록  2.장소 등록  3.확인 > 0
	      //     - Program end -
		
		int num = 0;
		String home = " ";
		String stay = " ";
		
		
		
		while(true) {
			
			System.out.print("1.집주소 등록  2.장소 등록  3.확인 >> ");
			num = scan.nextInt();
			if(num >=1 && num <= 2) {
				scan.nextLine();
			}
			
			if(num == 1) {
				System.out.print("집주소 입력 >> ");
				home = scan.nextLine();
			} else if(num == 2) {
				System.out.print("장소 입력 >> ");
				stay = scan.nextLine();
			} else if(num == 3) {
				System.out.println("집 : " + home);
				System.out.println("장소 : " + stay);
			} else if(num == 0) {
				System.out.print("- Program end -");
				break;
			} else {
				System.out.println("선택 오류");
			}

		} 
		
		
		
	}
}
