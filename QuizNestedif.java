package ch03_nestedif;

import java.util.Scanner;

public class QuizNestedif {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	    // 보유한 금액에 따라서 구매 가능한 아이템 목록을 보여주는 코드를 작성하세요
	    // - 3000 미만
	    //   : 일반 검, 일반 방패, 물약
	    //   5000 미만
	    //   : 쇠 검, 쇠 방패, 에너지 드링크
	    //   5000 이상
	    //   : 아이템 팩키지
		
		System.out.print("보유한 금액을 입력 > "); 
		int money = scan.nextInt();
		
//		if(money > 0) {
//			
//			if(money < 5000 ) {
//				if(money < 3000) {
//					System.out.println("구매 가능한 아이템 :일반 검, 일반 방패, 물약"); 
//				}else {
//					System.out.println("구매 가능한 아이템 : 쇠 검, 쇠 방패, 에너지 드링크, 일반 검, 일반 방패, 물약"); 
//				}
//				
//			} else {
//				System.out.println("구매 가능한 아이템 : 아이템 팩키지, 쇠 검, 쇠 방패, 에너지 드링크, 일반 검, 일반 방패, 물약"); 
//			}
//
//		} else {
//			System.out.println("보유 금액이 없습니다"); 
//		}
		
		
		if(money > 0) {
			System.out.println("구매 가능 아이템");
			System.out.println("일반 검, 일반 방패, 물약");
			if(money >= 3000) {
				System.out.println("쇠 검, 쇠 방패, 에너지 드링크");
				if(money >= 5000) {
					System.out.println("아이템 팩키지");
				}
			}
			
		} else {
			System.out.println("돈이 읍따");
		}
	      
		
		
		
	    // 물품의 크기, 무게에 따라서 사용 가능한 카트를 알려주는 코드를 작성하세요
	    // - 크기        무게         cart
	    //   small       50kg 미만    cart-A
	    //   small       50kg 이상    cart-B
	    //   large       50kg 미만    cart-C
	    //   large       50kg 이상    cart-D
		
//		System.out.print("제품의 크기(large or small) > "); 
//		String size = scan.next();
//		
//		if(size.equals("large") || size.equals("small")) {
//			System.out.print("제품의 무게(kg) > "); 
//			double we = scan.nextDouble();
//			
//			if(size.equals("large")) {
//				System.out.println("제품의 크기 : large");
//				if(we >= 50) {
//					System.out.println("제품의 무게 : 50kg 이상");
//					System.out.println("cart-D");
//				} else {
//					System.out.println("제품의 무게 : 50kg 미만");
//					System.out.println("cart-C");
//				}
//			} else {
//				System.out.println("제품의 크기 : small"); 
//				if(we >= 50) {
//					System.out.println("제품의 무게 : 50kg 이상");
//					System.out.println("cart-B");
//				} else {
//					System.out.println("제품의 무게 : 50kg 미만");
//					System.out.println("cart-A");
//				}
//
//			}
//		
//		} else {
//			System.out.println("다시 입력하시오");
//		}

				
	}		
}